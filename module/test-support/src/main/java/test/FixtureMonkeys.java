package test;

import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.api.introspector.ConstructorPropertiesArbitraryIntrospector;
import com.navercorp.fixturemonkey.jakarta.validation.plugin.JakartaValidationPlugin;

public final class FixtureMonkeys {

    private FixtureMonkeys() { }

    public static FixtureMonkey fixtureMonkeyConstructorProperties() {
        return FixtureMonkey.builder()
                .objectIntrospector(ConstructorPropertiesArbitraryIntrospector.INSTANCE)
                .plugin(new JakartaValidationPlugin())
                .build();
    }

    public static FixtureMonkey fixtureMonkey() {
        return FixtureMonkey.builder()
                .plugin(new JakartaValidationPlugin())
                .build();
    }
}