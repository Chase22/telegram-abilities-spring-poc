package io.chase22.telegram.abilities.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.objects.Ability;

import java.util.List;

@Component
public class AbilityRegistryService implements InitializingBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbilityRegistryService.class);

    private final List<Ability> abilities;

    public AbilityRegistryService(final List<Ability> abilities) {
        this.abilities = abilities;
    }

    @Override
    public void afterPropertiesSet() {
        abilities.forEach(ability -> LOGGER.info("Registering Ability {}", ability.name()));
    }
}
