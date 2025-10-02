package com.woolworths.scanlibrary.di.user;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.productsearch.SearchActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class UserActivityBuilderModule_BindSearchActivity {

    @ActivityScope
    @Subcomponent
    public interface SearchActivitySubcomponent extends AndroidInjector<SearchActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<SearchActivity> {
        }
    }
}
