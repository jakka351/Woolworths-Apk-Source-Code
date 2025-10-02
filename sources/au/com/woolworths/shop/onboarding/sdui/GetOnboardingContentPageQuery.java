package au.com.woolworths.shop.onboarding.sdui;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.onboarding.sdui.adapter.GetOnboardingContentPageQuery_ResponseAdapter;
import au.com.woolworths.shop.onboarding.sdui.fragment.OnboardingCtaFragment;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Data;", "Data", "GetOnboardingContentPage", "Header", "Image", "OnHostedIcon", "OnCoreIcon", "Content", "OnOnboardingVerticalContent", "Row", "Icon", "OnHostedIcon1", "OnCoreIcon1", "Footer", "Button1", "Button2", "Button3", "Companion", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetOnboardingContentPageQuery implements Query<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Button1;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f12497a;
        public final OnboardingCtaFragment b;

        public Button1(String str, OnboardingCtaFragment onboardingCtaFragment) {
            this.f12497a = str;
            this.b = onboardingCtaFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button1)) {
                return false;
            }
            Button1 button1 = (Button1) obj;
            return Intrinsics.c(this.f12497a, button1.f12497a) && Intrinsics.c(this.b, button1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12497a.hashCode() * 31);
        }

        public final String toString() {
            return "Button1(__typename=" + this.f12497a + ", onboardingCtaFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Button2;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f12498a;
        public final OnboardingCtaFragment b;

        public Button2(String str, OnboardingCtaFragment onboardingCtaFragment) {
            this.f12498a = str;
            this.b = onboardingCtaFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button2)) {
                return false;
            }
            Button2 button2 = (Button2) obj;
            return Intrinsics.c(this.f12498a, button2.f12498a) && Intrinsics.c(this.b, button2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12498a.hashCode() * 31);
        }

        public final String toString() {
            return "Button2(__typename=" + this.f12498a + ", onboardingCtaFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Button3;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f12499a;
        public final OnboardingCtaFragment b;

        public Button3(String str, OnboardingCtaFragment onboardingCtaFragment) {
            this.f12499a = str;
            this.b = onboardingCtaFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button3)) {
                return false;
            }
            Button3 button3 = (Button3) obj;
            return Intrinsics.c(this.f12499a, button3.f12499a) && Intrinsics.c(this.b, button3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12499a.hashCode() * 31);
        }

        public final String toString() {
            return "Button3(__typename=" + this.f12499a + ", onboardingCtaFragment=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Content;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f12500a;
        public final OnOnboardingVerticalContent b;

        public Content(String __typename, OnOnboardingVerticalContent onOnboardingVerticalContent) {
            Intrinsics.h(__typename, "__typename");
            this.f12500a = __typename;
            this.b = onOnboardingVerticalContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f12500a, content.f12500a) && Intrinsics.c(this.b, content.b);
        }

        public final int hashCode() {
            int iHashCode = this.f12500a.hashCode() * 31;
            OnOnboardingVerticalContent onOnboardingVerticalContent = this.b;
            return iHashCode + (onOnboardingVerticalContent == null ? 0 : onOnboardingVerticalContent.f12511a.hashCode());
        }

        public final String toString() {
            return "Content(__typename=" + this.f12500a + ", onOnboardingVerticalContent=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final GetOnboardingContentPage f12501a;

        public Data(GetOnboardingContentPage getOnboardingContentPage) {
            this.f12501a = getOnboardingContentPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12501a, ((Data) obj).f12501a);
        }

        public final int hashCode() {
            return this.f12501a.hashCode();
        }

        public final String toString() {
            return "Data(getOnboardingContentPage=" + this.f12501a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Footer;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final Button1 f12502a;
        public final Button2 b;
        public final Button3 c;

        public Footer(Button1 button1, Button2 button2, Button3 button3) {
            this.f12502a = button1;
            this.b = button2;
            this.c = button3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f12502a, footer.f12502a) && Intrinsics.c(this.b, footer.b) && Intrinsics.c(this.c, footer.c);
        }

        public final int hashCode() {
            int iHashCode = this.f12502a.hashCode() * 31;
            Button2 button2 = this.b;
            int iHashCode2 = (iHashCode + (button2 == null ? 0 : button2.hashCode())) * 31;
            Button3 button3 = this.c;
            return iHashCode2 + (button3 != null ? button3.hashCode() : 0);
        }

        public final String toString() {
            return "Footer(button1=" + this.f12502a + ", button2=" + this.b + ", button3=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$GetOnboardingContentPage;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetOnboardingContentPage {

        /* renamed from: a, reason: collision with root package name */
        public final Header f12503a;
        public final Content b;
        public final Footer c;

        public GetOnboardingContentPage(Header header, Content content, Footer footer) {
            this.f12503a = header;
            this.b = content;
            this.c = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetOnboardingContentPage)) {
                return false;
            }
            GetOnboardingContentPage getOnboardingContentPage = (GetOnboardingContentPage) obj;
            return Intrinsics.c(this.f12503a, getOnboardingContentPage.f12503a) && Intrinsics.c(this.b, getOnboardingContentPage.b) && Intrinsics.c(this.c, getOnboardingContentPage.c);
        }

        public final int hashCode() {
            Header header = this.f12503a;
            return this.c.hashCode() + ((this.b.hashCode() + ((header == null ? 0 : header.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "GetOnboardingContentPage(header=" + this.f12503a + ", content=" + this.b + ", footer=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Header;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final Image f12504a;
        public final String b;

        public Header(Image image, String str) {
            this.f12504a = image;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f12504a, header.f12504a) && Intrinsics.c(this.b, header.b);
        }

        public final int hashCode() {
            Image image = this.f12504a;
            return this.b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
        }

        public final String toString() {
            return "Header(image=" + this.f12504a + ", title=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Icon;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f12505a;
        public final OnHostedIcon1 b;
        public final OnCoreIcon1 c;

        public Icon(String __typename, OnHostedIcon1 onHostedIcon1, OnCoreIcon1 onCoreIcon1) {
            Intrinsics.h(__typename, "__typename");
            this.f12505a = __typename;
            this.b = onHostedIcon1;
            this.c = onCoreIcon1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f12505a, icon.f12505a) && Intrinsics.c(this.b, icon.b) && Intrinsics.c(this.c, icon.c);
        }

        public final int hashCode() {
            int iHashCode = this.f12505a.hashCode() * 31;
            OnHostedIcon1 onHostedIcon1 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon1 == null ? 0 : onHostedIcon1.f12510a.hashCode())) * 31;
            OnCoreIcon1 onCoreIcon1 = this.c;
            return iHashCode2 + (onCoreIcon1 != null ? onCoreIcon1.f12508a.hashCode() : 0);
        }

        public final String toString() {
            return "Icon(__typename=" + this.f12505a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Image;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image {

        /* renamed from: a, reason: collision with root package name */
        public final String f12506a;
        public final OnHostedIcon b;
        public final OnCoreIcon c;

        public Image(String __typename, OnHostedIcon onHostedIcon, OnCoreIcon onCoreIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f12506a = __typename;
            this.b = onHostedIcon;
            this.c = onCoreIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return Intrinsics.c(this.f12506a, image.f12506a) && Intrinsics.c(this.b, image.b) && Intrinsics.c(this.c, image.c);
        }

        public final int hashCode() {
            int iHashCode = this.f12506a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.f12509a.hashCode())) * 31;
            OnCoreIcon onCoreIcon = this.c;
            return iHashCode2 + (onCoreIcon != null ? onCoreIcon.f12507a.hashCode() : 0);
        }

        public final String toString() {
            return "Image(__typename=" + this.f12506a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnCoreIcon;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f12507a;

        public OnCoreIcon(String str) {
            this.f12507a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon) && Intrinsics.c(this.f12507a, ((OnCoreIcon) obj).f12507a);
        }

        public final int hashCode() {
            return this.f12507a.hashCode();
        }

        public final String toString() {
            return a.h("OnCoreIcon(coreIconName=", this.f12507a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnCoreIcon1;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f12508a;

        public OnCoreIcon1(String str) {
            this.f12508a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon1) && Intrinsics.c(this.f12508a, ((OnCoreIcon1) obj).f12508a);
        }

        public final int hashCode() {
            return this.f12508a.hashCode();
        }

        public final String toString() {
            return a.h("OnCoreIcon1(coreIconName=", this.f12508a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnHostedIcon;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f12509a;

        public OnHostedIcon(String str) {
            this.f12509a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f12509a, ((OnHostedIcon) obj).f12509a);
        }

        public final int hashCode() {
            return this.f12509a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f12509a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnHostedIcon1;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f12510a;

        public OnHostedIcon1(String str) {
            this.f12510a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon1) && Intrinsics.c(this.f12510a, ((OnHostedIcon1) obj).f12510a);
        }

        public final int hashCode() {
            return this.f12510a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon1(url=", this.f12510a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnOnboardingVerticalContent;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOnboardingVerticalContent {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12511a;

        public OnOnboardingVerticalContent(ArrayList arrayList) {
            this.f12511a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOnboardingVerticalContent) && this.f12511a.equals(((OnOnboardingVerticalContent) obj).f12511a);
        }

        public final int hashCode() {
            return this.f12511a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnOnboardingVerticalContent(rows=", ")", this.f12511a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Row;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Row {

        /* renamed from: a, reason: collision with root package name */
        public final Icon f12512a;
        public final String b;
        public final String c;

        public Row(Icon icon, String str, String str2) {
            this.f12512a = icon;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.c(this.f12512a, row.f12512a) && Intrinsics.c(this.b, row.b) && Intrinsics.c(this.c, row.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f12512a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Row(icon=");
            sb.append(this.f12512a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            return a.o(sb, this.c, ")");
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(GetOnboardingContentPageQuery_ResponseAdapter.Data.f12517a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query getOnboardingContentPage { getOnboardingContentPage { header { image { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } title } content { __typename ... on OnboardingVerticalContent { rows { icon { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } title subtitle } } } footer { button1 { __typename ...onboardingCtaFragment } button2 { __typename ...onboardingCtaFragment } button3 { __typename ...onboardingCtaFragment } } } }  fragment onboardingCtaFragment on Button { buttonId label style enabled buttonAction { type action id } iconUrl altText analytics { label } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == GetOnboardingContentPageQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(GetOnboardingContentPageQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "f8f4e4ef1394fc0178c0ed57466d27ca50c7044fafcb1a048713c613e1b2800c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "getOnboardingContentPage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
