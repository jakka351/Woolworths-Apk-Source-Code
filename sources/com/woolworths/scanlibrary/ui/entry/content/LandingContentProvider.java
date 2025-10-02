package com.woolworths.scanlibrary.ui.entry.content;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/content/LandingContentProvider;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LandingContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21254a;
    public final FeatureToggleManager b;
    public final boolean c;

    public LandingContentProvider(Context context, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(context, "context");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f21254a = context;
        this.b = featureToggleManager;
        this.c = !featureToggleManager.c(ScanAndGoFeature.e);
    }

    public final String a(int i) {
        String string = this.f21254a.getString(i);
        Intrinsics.g(string, "getString(...)");
        return string;
    }
}
