package edu.stanford.bmir.protege.web.client.search;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;
import com.google.common.collect.ImmutableList;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import edu.stanford.bmir.protege.web.client.renderer.PrimitiveDataIconProvider;
import edu.stanford.bmir.protege.web.shared.entity.OWLEntityData;
import edu.stanford.bmir.protege.web.shared.search.EntitySearchResult;

import javax.annotation.Nonnull;
import javax.inject.Provider;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.collect.ImmutableList.toImmutableList;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-07-24
 */
public class EntitySearchResultPresenter {

    @Nonnull
    private final EntitySearchResult result;

    @Nonnull
    private final EntitySearchResultView view;

    private final Provider<SearchResultMatchPresenter> matchPresenterProvider;

    @AutoFactory
    public EntitySearchResultPresenter(@Nonnull EntitySearchResult result,
                                       @Provided @Nonnull EntitySearchResultView view,
                                       @Provided @Nonnull Provider<SearchResultMatchPresenter> matchPresenterProvider) {
        this.result = checkNotNull(result);
        this.view = checkNotNull(view);
        this.matchPresenterProvider = checkNotNull(matchPresenterProvider);
    }

    public void start() {
        ImmutableList<SearchResultMatchView> views = result.getMatches()
              .stream()
              .map(resultMatch -> {
                  SearchResultMatchPresenter presenter = matchPresenterProvider.get();
                  presenter.setSearchResultMatch(resultMatch);
                  return presenter;
              })
              .map(SearchResultMatchPresenter::getView)
              .collect(toImmutableList());
        this.view.setEntity(result.getEntity());
        this.view.setResultMatchViews(views);
    }

    @Nonnull
    public EntitySearchResultView getView() {
        return view;
    }

    @Nonnull
    public OWLEntityData getEntity() {
        return result.getEntity();
    }
}
