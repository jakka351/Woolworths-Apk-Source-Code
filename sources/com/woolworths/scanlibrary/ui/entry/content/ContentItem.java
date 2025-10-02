package com.woolworths.scanlibrary.ui.entry.content;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/content/ContentItem;", "Lcom/woolworths/scanlibrary/ui/entry/content/LandingContent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ContentItem implements LandingContent {

    /* renamed from: a, reason: collision with root package name */
    public final int f21252a;
    public final String b;
    public final String c;
    public final String d;
    public final LandingContentAction e;

    public ContentItem(int i, String str, String str2, String str3, LandingContentAction landingContentAction) {
        this.f21252a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = landingContentAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentItem)) {
            return false;
        }
        ContentItem contentItem = (ContentItem) obj;
        return this.f21252a == contentItem.f21252a && Intrinsics.c(this.b, contentItem.b) && Intrinsics.c(this.c, contentItem.c) && Intrinsics.c(this.d, contentItem.d) && this.e == contentItem.e;
    }

    public final int hashCode() {
        int iC = b.c(b.c(Integer.hashCode(this.f21252a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        LandingContentAction landingContentAction = this.e;
        return iHashCode + (landingContentAction != null ? landingContentAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = a.p("ContentItem(resIcon=", this.f21252a, ", title=", this.b, ", body=");
        a.B(sbP, this.c, ", actionLabel=", this.d, ", action=");
        sbP.append(this.e);
        sbP.append(")");
        return sbP.toString();
    }
}
