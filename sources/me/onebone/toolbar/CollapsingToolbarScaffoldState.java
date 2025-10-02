package me.onebone.toolbar;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/CollapsingToolbarScaffoldState;", "", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class CollapsingToolbarScaffoldState {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsingToolbarState f24914a;
    public final MutableState b;

    public CollapsingToolbarScaffoldState(CollapsingToolbarState toolbarState, int i) {
        Intrinsics.h(toolbarState, "toolbarState");
        this.f24914a = toolbarState;
        this.b = SnapshotStateKt.f(Integer.valueOf(i));
    }
}
