package com.woolworths.scanlibrary.util.resource;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/util/resource/ResourceResolverImpl;", "Lcom/woolworths/scanlibrary/util/resource/ResourceResolver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResourceResolverImpl implements ResourceResolver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21374a;

    public ResourceResolverImpl(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f21374a = context;
    }

    @Override // com.woolworths.scanlibrary.util.resource.ResourceResolver
    public final String getString(int i) {
        String string = this.f21374a.getString(i);
        Intrinsics.g(string, "getString(...)");
        return string;
    }
}
