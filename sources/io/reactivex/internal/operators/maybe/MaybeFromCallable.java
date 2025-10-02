package io.reactivex.internal.operators.maybe;

import au.com.woolworths.android.onesite.database.RecentSearchDao_Impl$getAllRecentSearches$1;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class MaybeFromCallable<T> extends Maybe<T> implements Callable<T> {
    public final RecentSearchDao_Impl$getAllRecentSearches$1 d;

    public MaybeFromCallable(RecentSearchDao_Impl$getAllRecentSearches$1 recentSearchDao_Impl$getAllRecentSearches$1) {
        this.d = recentSearchDao_Impl$getAllRecentSearches$1;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        Disposable disposableB = Disposables.b(Functions.b);
        maybeObserver.d(disposableB);
        if (disposableB.b()) {
            return;
        }
        try {
            List<? extends RecentSearch> listCall = this.d.call();
            if (disposableB.b()) {
                return;
            }
            maybeObserver.onSuccess(listCall);
        } catch (Throwable th) {
            Exceptions.b(th);
            if (disposableB.b()) {
                RxJavaPlugins.b(th);
            } else {
                maybeObserver.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.d.call();
    }
}
