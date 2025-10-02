package com.google.accompanist.web;

import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.accompanist.web.LoadingState;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebViewState;", "", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WebViewState {
    public final MutableState b;
    public Bundle g;

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f14382a = SnapshotStateKt.f(null);
    public final MutableState c = SnapshotStateKt.f(LoadingState.Initializing.f14375a);
    public final MutableState d = SnapshotStateKt.f(null);
    public final MutableState e = SnapshotStateKt.f(null);
    public final SnapshotStateList f = new SnapshotStateList();
    public final MutableState h = SnapshotStateKt.f(null);

    public WebViewState(WebContent webContent) {
        this.b = SnapshotStateKt.f(webContent);
    }
}
