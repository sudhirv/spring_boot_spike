package com.thoughtworks.spike;

import com.thoughtworks.spike.domain.Partner;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;

public class YamlDeserialisationTest {

    @Test
    public void shouldDeserialiseTheYamlUsingSnakeYaml() throws FileNotFoundException {
        InputStream input = new FileInputStream(new File("partnerInformation.yml"));
        Yaml yaml = new Yaml();

        Partner partner = yaml.loadAs(input, Partner.class);

        assertNotNull(partner);

        assertNotNull(partner.RCI);
        assertThat(partner.RCI.detailsPage, is("rci/details.jsp"));

        assertNotNull(partner.Generic);
        assertThat(partner.Generic.detailsPage, is("generic/details.jsp"));
    }

    @Test
    public void shouldDeserialiseTheYamlForTheGenericSearchPage() throws FileNotFoundException {
        InputStream input = new FileInputStream(new File("partnerInformation.yml"));
        Yaml yaml = new Yaml();

        Partner partner = yaml.loadAs(input, Partner.class);

        assertNotNull(partner.Generic);
        assertThat(partner.Generic.searchPage, is("generic/search.jsp"));
    }

    @Test
    public void shouldDeserialiseTheYamlForTheRCISearchPage() throws FileNotFoundException {
        InputStream input = new FileInputStream(new File("partnerInformation.yml"));
        Yaml yaml = new Yaml();

        Partner partner = yaml.loadAs(input, Partner.class);

        assertNotNull(partner.RCI);
        assertThat(partner.RCI.searchPage, is("generic/search.jsp"));
    }
}
