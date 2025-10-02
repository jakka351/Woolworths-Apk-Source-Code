package com.google.accompanist.web;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/accompanist/web/WebViewNavigator;", "", "NavigationEvent", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WebViewNavigator {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f14381a;
    public final SharedFlowImpl b = SharedFlowKt.b(1, 0, null, 6);
    public final MutableState c;
    public final MutableState d;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent;", "", "Back", "Forward", "LoadHtml", "LoadUrl", "Reload", "StopLoading", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$Back;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$Forward;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$LoadHtml;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$LoadUrl;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$Reload;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$StopLoading;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface NavigationEvent {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$Back;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Back implements NavigationEvent {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$Forward;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Forward implements NavigationEvent {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$LoadHtml;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadHtml implements NavigationEvent {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof LoadHtml) {
                    throw null;
                }
                return false;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                throw null;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$LoadUrl;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadUrl implements NavigationEvent {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof LoadUrl) {
                    throw null;
                }
                return false;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                throw null;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$Reload;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Reload implements NavigationEvent {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent$StopLoading;", "Lcom/google/accompanist/web/WebViewNavigator$NavigationEvent;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StopLoading implements NavigationEvent {
        }
    }

    public WebViewNavigator(CoroutineScope coroutineScope) {
        this.f14381a = coroutineScope;
        Boolean bool = Boolean.FALSE;
        this.c = SnapshotStateKt.f(bool);
        this.d = SnapshotStateKt.f(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.webkit.WebView r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$1
            if (r0 == 0) goto L13
            r0 = r7
            com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$1 r0 = (com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$1 r0 = new com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            kotlin.ResultKt.b(r7)
            goto L45
        L2f:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.internal.MainDispatcherLoader.f24726a
            com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$2 r2 = new com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.r = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)
            if (r6 != r1) goto L45
            return
        L45:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.web.WebViewNavigator.a(android.webkit.WebView, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
