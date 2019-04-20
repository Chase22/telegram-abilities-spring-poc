package io.chase22.telegram.abilities.poc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.sender.MessageSender;
import org.telegram.abilitybots.api.sender.SilentSender;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

/**
 * This class makes a bunch of important objects available as beans
 */
@Component
public class AbilityBeanFactory {
    private final AbilityPocBot abilityPocBot;

    public AbilityBeanFactory(final AbilityPocBot abilityPocBot) {
        this.abilityPocBot = abilityPocBot;
    }

    @Bean
    public MessageSender messageSender() {
        return abilityPocBot.messageSender();
    }

    @Bean
    public SilentSender silentSender() {
        return abilityPocBot.silentSender();
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE) // has to be prototype so a new builder is injected each time this bean is autowired
    public Ability.AbilityBuilder abilityBuilder() {
        return Ability.builder();
    }
}
