package com.google.accompanist.web;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/google/accompanist/web/LoadingState;", "", "Finished", "Initializing", "Loading", "Lcom/google/accompanist/web/LoadingState$Finished;", "Lcom/google/accompanist/web/LoadingState$Initializing;", "Lcom/google/accompanist/web/LoadingState$Loading;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LoadingState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/LoadingState$Finished;", "Lcom/google/accompanist/web/LoadingState;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Finished extends LoadingState {

        /* renamed from: a, reason: collision with root package name */
        public static final Finished f14374a = new Finished();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/LoadingState$Initializing;", "Lcom/google/accompanist/web/LoadingState;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Initializing extends LoadingState {

        /* renamed from: a, reason: collision with root package name */
        public static final Initializing f14375a = new Initializing();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/LoadingState$Loading;", "Lcom/google/accompanist/web/LoadingState;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends LoadingState {

        /* renamed from: a, reason: collision with root package name */
        public final float f14376a;

        public Loading(float f) {
            this.f14376a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Float.compare(this.f14376a, ((Loading) obj).f14376a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f14376a);
        }

        public final String toString() {
            return a.r(new StringBuilder("Loading(progress="), this.f14376a, ')');
        }
    }
}
