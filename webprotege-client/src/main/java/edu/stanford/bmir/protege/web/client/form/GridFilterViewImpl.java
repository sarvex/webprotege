package edu.stanford.bmir.protege.web.client.form;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;

import static com.google.common.base.Preconditions.checkNotNull;

public class GridFilterViewImpl extends Composite implements GridFilterView {

    interface GridFilterViewImplUiBinder extends UiBinder<HTMLPanel, GridFilterViewImpl> {
    }

    private static GridFilterViewImplUiBinder ourUiBinder = GWT.create(GridFilterViewImplUiBinder.class);

    @Nonnull
    private final Provider<GridColumnFilterContainer> filterContainerProvider;

    @UiField
    HTMLPanel outer;

    @Inject
    public GridFilterViewImpl(@Nonnull Provider<GridColumnFilterContainer> filterContainerProvider) {
        this.filterContainerProvider = checkNotNull(filterContainerProvider);
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @Nonnull
    @Override
    public AcceptsOneWidget addFilter(@Nonnull String columnName) {
        GridColumnFilterContainer container = filterContainerProvider.get();
        container.setColumnName(columnName);
        outer.add(container);
        return container.getFilterContainer();
    }

    @Override
    public void clear() {
        outer.clear();
    }
}