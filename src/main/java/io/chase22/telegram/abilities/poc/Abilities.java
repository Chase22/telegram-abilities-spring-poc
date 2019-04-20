package io.chase22.telegram.abilities.poc;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.sender.SilentSender;

import static org.telegram.abilitybots.api.objects.Locality.USER;
import static org.telegram.abilitybots.api.objects.Privacy.PUBLIC;

@Component
public class Abilities {

    private final SilentSender silent;

    public Abilities(final SilentSender silent) {
        this.silent = silent;
    }

    @Bean
    public Ability helloWorldBean(Ability.AbilityBuilder builder) {
        return builder
                .name("helloWorld")
                .info("says hello world!")
                .input(0)
                .privacy(PUBLIC)
                .locality(USER)
                .action(ctx -> silent.send("Hello world!", ctx.chatId()))
                .build();
    }
}
