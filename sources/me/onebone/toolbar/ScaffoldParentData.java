package me.onebone.toolbar;

import androidx.compose.ui.BiasAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/ScaffoldParentData;", "", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class ScaffoldParentData {

    /* renamed from: a, reason: collision with root package name */
    public BiasAlignment f24917a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScaffoldParentData) && Intrinsics.c(this.f24917a, ((ScaffoldParentData) obj).f24917a);
    }

    public final int hashCode() {
        BiasAlignment biasAlignment = this.f24917a;
        if (biasAlignment == null) {
            return 0;
        }
        return biasAlignment.hashCode();
    }

    public final String toString() {
        return "ScaffoldParentData(alignment=" + this.f24917a + ')';
    }
}
