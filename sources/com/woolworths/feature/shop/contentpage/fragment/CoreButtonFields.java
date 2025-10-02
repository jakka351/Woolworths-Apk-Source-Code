package com.woolworths.feature.shop.contentpage.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.CoreButtonStyle;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "CoreButtonLeadingIcon", "CoreButtonTrailingIcon", "CoreButtonAction", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CoreButtonFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final CoreButtonStyle f19746a;
    public final String b;
    public final CoreButtonLeadingIcon c;
    public final CoreButtonTrailingIcon d;
    public final CoreButtonAction e;
    public final boolean f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFields$CoreButtonAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19747a;
        public final ActionFields b;

        public CoreButtonAction(String str, ActionFields actionFields) {
            this.f19747a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoreButtonAction)) {
                return false;
            }
            CoreButtonAction coreButtonAction = (CoreButtonAction) obj;
            return Intrinsics.c(this.f19747a, coreButtonAction.f19747a) && Intrinsics.c(this.b, coreButtonAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19747a.hashCode() * 31);
        }

        public final String toString() {
            return "CoreButtonAction(__typename=" + this.f19747a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFields$CoreButtonLeadingIcon;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreButtonLeadingIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19748a;
        public final CoreIconFields b;

        public CoreButtonLeadingIcon(String str, CoreIconFields coreIconFields) {
            this.f19748a = str;
            this.b = coreIconFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoreButtonLeadingIcon)) {
                return false;
            }
            CoreButtonLeadingIcon coreButtonLeadingIcon = (CoreButtonLeadingIcon) obj;
            return Intrinsics.c(this.f19748a, coreButtonLeadingIcon.f19748a) && Intrinsics.c(this.b, coreButtonLeadingIcon.b);
        }

        public final int hashCode() {
            return this.b.f19754a.hashCode() + (this.f19748a.hashCode() * 31);
        }

        public final String toString() {
            return "CoreButtonLeadingIcon(__typename=" + this.f19748a + ", coreIconFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFields$CoreButtonTrailingIcon;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreButtonTrailingIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19749a;
        public final CoreIconFields b;

        public CoreButtonTrailingIcon(String str, CoreIconFields coreIconFields) {
            this.f19749a = str;
            this.b = coreIconFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoreButtonTrailingIcon)) {
                return false;
            }
            CoreButtonTrailingIcon coreButtonTrailingIcon = (CoreButtonTrailingIcon) obj;
            return Intrinsics.c(this.f19749a, coreButtonTrailingIcon.f19749a) && Intrinsics.c(this.b, coreButtonTrailingIcon.b);
        }

        public final int hashCode() {
            return this.b.f19754a.hashCode() + (this.f19749a.hashCode() * 31);
        }

        public final String toString() {
            return "CoreButtonTrailingIcon(__typename=" + this.f19749a + ", coreIconFields=" + this.b + ")";
        }
    }

    public CoreButtonFields(CoreButtonStyle coreButtonStyle, String str, CoreButtonLeadingIcon coreButtonLeadingIcon, CoreButtonTrailingIcon coreButtonTrailingIcon, CoreButtonAction coreButtonAction, boolean z) {
        this.f19746a = coreButtonStyle;
        this.b = str;
        this.c = coreButtonLeadingIcon;
        this.d = coreButtonTrailingIcon;
        this.e = coreButtonAction;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreButtonFields)) {
            return false;
        }
        CoreButtonFields coreButtonFields = (CoreButtonFields) obj;
        return this.f19746a == coreButtonFields.f19746a && Intrinsics.c(this.b, coreButtonFields.b) && Intrinsics.c(this.c, coreButtonFields.c) && Intrinsics.c(this.d, coreButtonFields.d) && Intrinsics.c(this.e, coreButtonFields.e) && this.f == coreButtonFields.f;
    }

    public final int hashCode() {
        int iC = b.c(this.f19746a.hashCode() * 31, 31, this.b);
        CoreButtonLeadingIcon coreButtonLeadingIcon = this.c;
        int iHashCode = (iC + (coreButtonLeadingIcon == null ? 0 : coreButtonLeadingIcon.hashCode())) * 31;
        CoreButtonTrailingIcon coreButtonTrailingIcon = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iHashCode + (coreButtonTrailingIcon != null ? coreButtonTrailingIcon.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreButtonFields(coreButtonStyle=" + this.f19746a + ", coreButtonLabel=" + this.b + ", coreButtonLeadingIcon=" + this.c + ", coreButtonTrailingIcon=" + this.d + ", coreButtonAction=" + this.e + ", coreButtonEnabled=" + this.f + ")";
    }
}
