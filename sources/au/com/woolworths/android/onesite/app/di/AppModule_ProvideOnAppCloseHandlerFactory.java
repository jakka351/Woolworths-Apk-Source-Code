package au.com.woolworths.android.onesite.app.di;

import android.app.Activity;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.products.models.ListExtras;
import au.com.woolworths.android.onesite.products.models.ListLaunchSource;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import com.woolworths.scanlibrary.configuration.OnSngAppCloseHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideOnAppCloseHandlerFactory implements Factory<OnSngAppCloseHandler> {
    /* JADX WARN: Type inference failed for: r0v2, types: [au.com.woolworths.android.onesite.app.di.AppModule$provideOnAppCloseHandler$1] */
    public static AppModule$provideOnAppCloseHandler$1 a(AppModule appModule, final ListsInMemoryRepository listsInMemoryRepository) {
        appModule.getClass();
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        return new OnSngAppCloseHandler() { // from class: au.com.woolworths.android.onesite.app.di.AppModule$provideOnAppCloseHandler$1

            /* renamed from: a, reason: collision with root package name */
            public Activities.MainActivity.Tab f4219a;

            @Override // com.woolworths.scanlibrary.configuration.OnSngAppCloseHandler
            public final void a(Activity activity) {
                ListsInMemoryRepository listsInMemoryRepository2 = listsInMemoryRepository;
                listsInMemoryRepository2.getClass();
                Parcelable.Creator<ListLaunchSource> creator = ListLaunchSource.CREATOR;
                listsInMemoryRepository2.e = new ListExtras(24);
                Activities.MainActivity.Tab tab = this.f4219a;
                if (tab == null) {
                    tab = Activities.MainActivity.Tab.h;
                }
                Activities.MainActivity.f4487a.d(activity, tab);
                this.f4219a = null;
                activity.finish();
            }

            @Override // com.woolworths.scanlibrary.configuration.OnSngAppCloseHandler
            public final void b(Activities.MainActivity.Tab tab) {
                Intrinsics.h(tab, "tab");
                this.f4219a = tab;
            }
        };
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
