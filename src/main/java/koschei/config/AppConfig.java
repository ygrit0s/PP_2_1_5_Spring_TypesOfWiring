package koschei.config;

import koschei.models.*;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Contract(value = "_ -> new", pure = true)
    @Bean
    public static @NotNull Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Contract(value = "_ -> new", pure = true)
    @Bean
    public static @NotNull Egg6 getEgg(Needle7 needle) {
        return new Egg6(needle);
    }

    @Contract(value = "_ -> new", pure = true)
    @Bean
    public static @NotNull Needle7 getNeedle(Death8 deth) {
        return new Needle7(deth);
    }
}
