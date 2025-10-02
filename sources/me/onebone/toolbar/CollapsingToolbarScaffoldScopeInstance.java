package me.onebone.toolbar;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/CollapsingToolbarScaffoldScopeInstance;", "Lme/onebone/toolbar/CollapsingToolbarScaffoldScope;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class CollapsingToolbarScaffoldScopeInstance implements CollapsingToolbarScaffoldScope {

    /* renamed from: a, reason: collision with root package name */
    public static final CollapsingToolbarScaffoldScopeInstance f24913a = new CollapsingToolbarScaffoldScopeInstance();

    @Override // me.onebone.toolbar.CollapsingToolbarScaffoldScope
    public final Modifier a() {
        return new ScaffoldChildAlignmentModifier();
    }
}
