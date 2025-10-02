package com.woolworths.scanlibrary.ui.entry.content;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/content/ContentTitle;", "Lcom/woolworths/scanlibrary/ui/entry/content/LandingContent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ContentTitle implements LandingContent {

    /* renamed from: a, reason: collision with root package name */
    public final String f21253a;
    public final String b;

    public ContentTitle(String str, String str2) {
        this.f21253a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentTitle)) {
            return false;
        }
        ContentTitle contentTitle = (ContentTitle) obj;
        return Intrinsics.c(this.f21253a, contentTitle.f21253a) && Intrinsics.c(this.b, contentTitle.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21253a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ContentTitle(title=", this.f21253a, ", body=", this.b, ")");
    }
}
