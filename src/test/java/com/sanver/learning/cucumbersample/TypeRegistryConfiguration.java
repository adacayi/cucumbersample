package com.sanver.learning.cucumbersample;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;
import java.util.Map;

import static java.util.Locale.ENGLISH;

@SuppressWarnings({"WeakerAccess", "unused"})
public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(
                User.class,
                (Map<String, String> row) -> new User(
                        row.get("UserName"),
                        row.get("Password"))
                )
        );
    }
}
