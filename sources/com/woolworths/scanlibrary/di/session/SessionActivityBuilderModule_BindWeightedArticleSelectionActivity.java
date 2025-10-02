package com.woolworths.scanlibrary.di.session;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.weighted.WeightedArticleSelectionActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class SessionActivityBuilderModule_BindWeightedArticleSelectionActivity {

    @ActivityScope
    @Subcomponent
    public interface WeightedArticleSelectionActivitySubcomponent extends AndroidInjector<WeightedArticleSelectionActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<WeightedArticleSelectionActivity> {
        }
    }
}
