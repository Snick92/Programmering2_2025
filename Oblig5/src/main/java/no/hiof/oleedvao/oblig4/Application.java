package no.hiof.oleedvao.oblig4;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.http.util.JsonEscapeUtil;
import no.hiof.oleedvao.oblig4.model.TVSeries;
import no.hiof.oleedvao.oblig4.repository.TVSeriesDataRepository;
import org.jetbrains.annotations.NotNull;

public class Application {

    public static void main(String[] args) {

        Javalin app = Javalin.create(javalinConfig -> {
            javalinConfig.staticFiles.enableWebjars();
            javalinConfig.vue.vueInstanceNameInJs = "app";
        }).start(8080);


        app.get("/", new Handler() {
            @Override
            public void handle(@NotNull Context context) throws Exception {
                context.result("TEST");
            }
        });


        TVSeriesDataRepository repo = new TVSeriesDataRepository();
        System.out.println("Alle serier: ");
        for (TVSeries series : repo.getAllTVSeries()) {
            System.out.println(series);
        }
    }
}
