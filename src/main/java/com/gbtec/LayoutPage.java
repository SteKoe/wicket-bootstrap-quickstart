package com.gbtec;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public abstract class LayoutPage extends WebPage {
    private static final long serialVersionUID = 201408132102L;

    public LayoutPage(final PageParameters parameters) {
        super(parameters);
    }
}
