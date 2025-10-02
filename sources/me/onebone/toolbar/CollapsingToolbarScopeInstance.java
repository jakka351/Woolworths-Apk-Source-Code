package me.onebone.toolbar;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/CollapsingToolbarScopeInstance;", "Lme/onebone/toolbar/CollapsingToolbarScope;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class CollapsingToolbarScopeInstance implements CollapsingToolbarScope {

    /* renamed from: a, reason: collision with root package name */
    public static final CollapsingToolbarScopeInstance f24915a = new CollapsingToolbarScopeInstance();

    @Override // me.onebone.toolbar.CollapsingToolbarScope
    public final Modifier a(Modifier modifier, BiasAlignment biasAlignment) {
        Intrinsics.h(modifier, "<this>");
        return modifier.x0(new RoadModifier(biasAlignment));
    }

    @Override // me.onebone.toolbar.CollapsingToolbarScope
    public final Modifier b(Modifier modifier) {
        Intrinsics.h(modifier, "<this>");
        return modifier.x0(new ParallaxModifier());
    }
}
