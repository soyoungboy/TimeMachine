package me.drakeet.transformer;

import android.support.annotation.NonNull;
import com.google.android.agera.Supplier;
import me.drakeet.timemachine.Message;

/**
 * @author drakeet
 */
public class NewInEvent implements Supplier<Message> {

    @NonNull public final Message message;


    public NewInEvent(@NonNull Message in) {
        this.message = in;
    }


    @NonNull @Override public Message get() {
        return message;
    }
}
