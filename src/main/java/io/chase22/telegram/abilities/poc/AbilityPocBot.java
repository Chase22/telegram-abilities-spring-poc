package io.chase22.telegram.abilities.poc;

import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.sender.MessageSender;
import org.telegram.abilitybots.api.sender.SilentSender;

@Component
public class AbilityPocBot extends AbilityBot {

    public AbilityPocBot() {
        super("someToken", "someUname");
    }

    @Override
    public int creatorId() {
        return 0;
    }

    //Required getter for SilentSender
    public SilentSender silentSender() {
        return silent;
    }

    //Required getter for MessageSender
    public MessageSender messageSender() {
        return sender;
    }
}
