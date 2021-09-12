package springframework.sfgpetclinic.fauxspring;

import java.text.ParseException;
import java.util.Locale;

import springframework.sfgpetclinic.model.PetType;


public interface Formatter<T> {

    String print(PetType petType, Locale locale);

    PetType parse(String text, Locale locale) throws ParseException;
}
