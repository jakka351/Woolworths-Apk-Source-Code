package com.woolworths.feature.shop.contentpage.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.InfoTileIconSlotSize;
import au.com.woolworths.shop.graphql.type.InfoTileStyle;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "InfoTileIconSlot", "InfoTileCta", "Icon", "OnHostedIcon", "OnInfoTileBadge", "InfoTileCtaAction", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoTileFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final InfoTileIconSlot f19770a;
    public final String b;
    public final String c;
    public final InfoTileCta d;
    public final InfoTileStyle e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$Icon;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19771a;
        public final OnHostedIcon b;
        public final OnInfoTileBadge c;

        public Icon(String __typename, OnHostedIcon onHostedIcon, OnInfoTileBadge onInfoTileBadge) {
            Intrinsics.h(__typename, "__typename");
            this.f19771a = __typename;
            this.b = onHostedIcon;
            this.c = onInfoTileBadge;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f19771a, icon.f19771a) && Intrinsics.c(this.b, icon.b) && Intrinsics.c(this.c, icon.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19771a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.hashCode())) * 31;
            OnInfoTileBadge onInfoTileBadge = this.c;
            return iHashCode2 + (onInfoTileBadge != null ? onInfoTileBadge.f19776a.hashCode() : 0);
        }

        public final String toString() {
            return "Icon(__typename=" + this.f19771a + ", onHostedIcon=" + this.b + ", onInfoTileBadge=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$InfoTileCta;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoTileCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f19772a;
        public final InfoTileCtaAction b;

        public InfoTileCta(String str, InfoTileCtaAction infoTileCtaAction) {
            this.f19772a = str;
            this.b = infoTileCtaAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoTileCta)) {
                return false;
            }
            InfoTileCta infoTileCta = (InfoTileCta) obj;
            return Intrinsics.c(this.f19772a, infoTileCta.f19772a) && Intrinsics.c(this.b, infoTileCta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19772a.hashCode() * 31);
        }

        public final String toString() {
            return "InfoTileCta(infoTileCtaLabel=" + this.f19772a + ", infoTileCtaAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$InfoTileCtaAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoTileCtaAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19773a;
        public final ActionFields b;

        public InfoTileCtaAction(String str, ActionFields actionFields) {
            this.f19773a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoTileCtaAction)) {
                return false;
            }
            InfoTileCtaAction infoTileCtaAction = (InfoTileCtaAction) obj;
            return Intrinsics.c(this.f19773a, infoTileCtaAction.f19773a) && Intrinsics.c(this.b, infoTileCtaAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19773a.hashCode() * 31);
        }

        public final String toString() {
            return "InfoTileCtaAction(__typename=" + this.f19773a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$InfoTileIconSlot;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoTileIconSlot {

        /* renamed from: a, reason: collision with root package name */
        public final Icon f19774a;
        public final InfoTileIconSlotSize b;

        public InfoTileIconSlot(Icon icon, InfoTileIconSlotSize infoTileIconSlotSize) {
            this.f19774a = icon;
            this.b = infoTileIconSlotSize;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoTileIconSlot)) {
                return false;
            }
            InfoTileIconSlot infoTileIconSlot = (InfoTileIconSlot) obj;
            return Intrinsics.c(this.f19774a, infoTileIconSlot.f19774a) && this.b == infoTileIconSlot.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19774a.hashCode() * 31);
        }

        public final String toString() {
            return "InfoTileIconSlot(icon=" + this.f19774a + ", size=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$OnHostedIcon;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19775a;
        public final HostedIconFields b;

        public OnHostedIcon(String str, HostedIconFields hostedIconFields) {
            this.f19775a = str;
            this.b = hostedIconFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHostedIcon)) {
                return false;
            }
            OnHostedIcon onHostedIcon = (OnHostedIcon) obj;
            return Intrinsics.c(this.f19775a, onHostedIcon.f19775a) && Intrinsics.c(this.b, onHostedIcon.b);
        }

        public final int hashCode() {
            return this.b.f19768a.hashCode() + (this.f19775a.hashCode() * 31);
        }

        public final String toString() {
            return "OnHostedIcon(__typename=" + this.f19775a + ", hostedIconFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$OnInfoTileBadge;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInfoTileBadge {

        /* renamed from: a, reason: collision with root package name */
        public final String f19776a;

        public OnInfoTileBadge(String str) {
            this.f19776a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnInfoTileBadge) && Intrinsics.c(this.f19776a, ((OnInfoTileBadge) obj).f19776a);
        }

        public final int hashCode() {
            return this.f19776a.hashCode();
        }

        public final String toString() {
            return a.h("OnInfoTileBadge(number=", this.f19776a, ")");
        }
    }

    public InfoTileFields(InfoTileIconSlot infoTileIconSlot, String str, String str2, InfoTileCta infoTileCta, InfoTileStyle infoTileStyle) {
        this.f19770a = infoTileIconSlot;
        this.b = str;
        this.c = str2;
        this.d = infoTileCta;
        this.e = infoTileStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoTileFields)) {
            return false;
        }
        InfoTileFields infoTileFields = (InfoTileFields) obj;
        return Intrinsics.c(this.f19770a, infoTileFields.f19770a) && Intrinsics.c(this.b, infoTileFields.b) && Intrinsics.c(this.c, infoTileFields.c) && Intrinsics.c(this.d, infoTileFields.d) && this.e == infoTileFields.e;
    }

    public final int hashCode() {
        InfoTileIconSlot infoTileIconSlot = this.f19770a;
        int iC = b.c((infoTileIconSlot == null ? 0 : infoTileIconSlot.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        InfoTileCta infoTileCta = this.d;
        return this.e.hashCode() + ((iHashCode + (infoTileCta != null ? infoTileCta.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "InfoTileFields(infoTileIconSlot=" + this.f19770a + ", infoTileTitle=" + this.b + ", infoTileBodyMarkdown=" + this.c + ", infoTileCta=" + this.d + ", infoTileStyle=" + this.e + ")";
    }
}
