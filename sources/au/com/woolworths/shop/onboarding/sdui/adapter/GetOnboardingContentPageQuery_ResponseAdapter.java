package au.com.woolworths.shop.onboarding.sdui.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.onboarding.sdui.GetOnboardingContentPageQuery;
import au.com.woolworths.shop.onboarding.sdui.fragment.OnboardingCtaFragment;
import au.com.woolworths.shop.onboarding.sdui.fragment.OnboardingCtaFragmentImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter;", "", "Data", "GetOnboardingContentPage", "Header", "Image", "OnHostedIcon", "OnCoreIcon", "Content", "OnOnboardingVerticalContent", "Row", "Icon", "OnHostedIcon1", "OnCoreIcon1", "Footer", "Button1", "Button2", "Button3", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetOnboardingContentPageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Button1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Button1;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Button1 implements Adapter<GetOnboardingContentPageQuery.Button1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button1 f12513a = new Button1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            OnboardingCtaFragment onboardingCtaFragmentA = OnboardingCtaFragmentImpl_ResponseAdapter.OnboardingCtaFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new GetOnboardingContentPageQuery.Button1(str, onboardingCtaFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Button1 value = (GetOnboardingContentPageQuery.Button1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12497a);
            List list = OnboardingCtaFragmentImpl_ResponseAdapter.OnboardingCtaFragment.f12534a;
            OnboardingCtaFragmentImpl_ResponseAdapter.OnboardingCtaFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Button2;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Button2;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Button2 implements Adapter<GetOnboardingContentPageQuery.Button2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button2 f12514a = new Button2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            OnboardingCtaFragment onboardingCtaFragmentA = OnboardingCtaFragmentImpl_ResponseAdapter.OnboardingCtaFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new GetOnboardingContentPageQuery.Button2(str, onboardingCtaFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Button2 value = (GetOnboardingContentPageQuery.Button2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12498a);
            List list = OnboardingCtaFragmentImpl_ResponseAdapter.OnboardingCtaFragment.f12534a;
            OnboardingCtaFragmentImpl_ResponseAdapter.OnboardingCtaFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Button3;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Button3;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Button3 implements Adapter<GetOnboardingContentPageQuery.Button3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button3 f12515a = new Button3();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            OnboardingCtaFragment onboardingCtaFragmentA = OnboardingCtaFragmentImpl_ResponseAdapter.OnboardingCtaFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new GetOnboardingContentPageQuery.Button3(str, onboardingCtaFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Button3 value = (GetOnboardingContentPageQuery.Button3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12499a);
            List list = OnboardingCtaFragmentImpl_ResponseAdapter.OnboardingCtaFragment.f12534a;
            OnboardingCtaFragmentImpl_ResponseAdapter.OnboardingCtaFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Content;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Content implements Adapter<GetOnboardingContentPageQuery.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f12516a = new Content();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOnboardingContentPageQuery.OnOnboardingVerticalContent onOnboardingVerticalContentA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("OnboardingVerticalContent"))) {
                reader.o();
                onOnboardingVerticalContentA = OnOnboardingVerticalContent.a(reader, customScalarAdapters);
            }
            return new GetOnboardingContentPageQuery.Content(str, onOnboardingVerticalContentA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Content value = (GetOnboardingContentPageQuery.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12500a);
            GetOnboardingContentPageQuery.OnOnboardingVerticalContent onOnboardingVerticalContent = value.b;
            if (onOnboardingVerticalContent != null) {
                OnOnboardingVerticalContent.b(writer, customScalarAdapters, onOnboardingVerticalContent);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Data;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Data implements Adapter<GetOnboardingContentPageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12517a = new Data();
        public static final List b = CollectionsKt.Q("getOnboardingContentPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOnboardingContentPageQuery.GetOnboardingContentPage getOnboardingContentPage = null;
            while (reader.o2(b) == 0) {
                getOnboardingContentPage = (GetOnboardingContentPageQuery.GetOnboardingContentPage) Adapters.c(GetOnboardingContentPage.f12519a, false).fromJson(reader, customScalarAdapters);
            }
            if (getOnboardingContentPage != null) {
                return new GetOnboardingContentPageQuery.Data(getOnboardingContentPage);
            }
            Assertions.a(reader, "getOnboardingContentPage");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Data value = (GetOnboardingContentPageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("getOnboardingContentPage");
            Adapters.c(GetOnboardingContentPage.f12519a, false).toJson(writer, customScalarAdapters, value.f12501a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Footer;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Footer implements Adapter<GetOnboardingContentPageQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f12518a = new Footer();
        public static final List b = CollectionsKt.R("button1", "button2", "button3");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOnboardingContentPageQuery.Button1 button1 = null;
            GetOnboardingContentPageQuery.Button2 button2 = null;
            GetOnboardingContentPageQuery.Button3 button3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    button1 = (GetOnboardingContentPageQuery.Button1) Adapters.c(Button1.f12513a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    button2 = (GetOnboardingContentPageQuery.Button2) Adapters.b(Adapters.c(Button2.f12514a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    button3 = (GetOnboardingContentPageQuery.Button3) Adapters.b(Adapters.c(Button3.f12515a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (button1 != null) {
                return new GetOnboardingContentPageQuery.Footer(button1, button2, button3);
            }
            Assertions.a(reader, "button1");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Footer value = (GetOnboardingContentPageQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button1");
            Adapters.c(Button1.f12513a, true).toJson(writer, customScalarAdapters, value.f12502a);
            writer.F1("button2");
            Adapters.b(Adapters.c(Button2.f12514a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("button3");
            Adapters.b(Adapters.c(Button3.f12515a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$GetOnboardingContentPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$GetOnboardingContentPage;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class GetOnboardingContentPage implements Adapter<GetOnboardingContentPageQuery.GetOnboardingContentPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final GetOnboardingContentPage f12519a = new GetOnboardingContentPage();
        public static final List b = CollectionsKt.R("header", "content", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOnboardingContentPageQuery.Header header = null;
            GetOnboardingContentPageQuery.Content content = null;
            GetOnboardingContentPageQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    header = (GetOnboardingContentPageQuery.Header) Adapters.b(Adapters.c(Header.f12520a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    content = (GetOnboardingContentPageQuery.Content) Adapters.c(Content.f12516a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (GetOnboardingContentPageQuery.Footer) Adapters.c(Footer.f12518a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (content == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (footer != null) {
                return new GetOnboardingContentPageQuery.GetOnboardingContentPage(header, content, footer);
            }
            Assertions.a(reader, "footer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.GetOnboardingContentPage value = (GetOnboardingContentPageQuery.GetOnboardingContentPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.b(Adapters.c(Header.f12520a, false)).toJson(writer, customScalarAdapters, value.f12503a);
            writer.F1("content");
            Adapters.c(Content.f12516a, true).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footer");
            Adapters.c(Footer.f12518a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Header;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Header implements Adapter<GetOnboardingContentPageQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f12520a = new Header();
        public static final List b = CollectionsKt.R("image", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOnboardingContentPageQuery.Image image = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    image = (GetOnboardingContentPageQuery.Image) Adapters.b(Adapters.c(Image.f12522a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new GetOnboardingContentPageQuery.Header(image, str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Header value = (GetOnboardingContentPageQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            Adapters.b(Adapters.c(Image.f12522a, true)).toJson(writer, customScalarAdapters, value.f12504a);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Icon;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Icon implements Adapter<GetOnboardingContentPageQuery.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f12521a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            GetOnboardingContentPageQuery.OnHostedIcon1 onHostedIcon1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            GetOnboardingContentPageQuery.OnCoreIcon1 onCoreIcon1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon1A = OnHostedIcon1.a(reader, customScalarAdapters);
            } else {
                onHostedIcon1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon1A = OnCoreIcon1.a(reader, customScalarAdapters);
            }
            return new GetOnboardingContentPageQuery.Icon(str, onHostedIcon1A, onCoreIcon1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Icon value = (GetOnboardingContentPageQuery.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12505a);
            GetOnboardingContentPageQuery.OnHostedIcon1 onHostedIcon1 = value.b;
            if (onHostedIcon1 != null) {
                OnHostedIcon1.b(writer, customScalarAdapters, onHostedIcon1);
            }
            GetOnboardingContentPageQuery.OnCoreIcon1 onCoreIcon1 = value.c;
            if (onCoreIcon1 != null) {
                OnCoreIcon1.b(writer, customScalarAdapters, onCoreIcon1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Image;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Image;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Image implements Adapter<GetOnboardingContentPageQuery.Image> {

        /* renamed from: a, reason: collision with root package name */
        public static final Image f12522a = new Image();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            GetOnboardingContentPageQuery.OnHostedIcon onHostedIconA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            GetOnboardingContentPageQuery.OnCoreIcon onCoreIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            } else {
                onHostedIconA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIconA = OnCoreIcon.a(reader, customScalarAdapters);
            }
            return new GetOnboardingContentPageQuery.Image(str, onHostedIconA, onCoreIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Image value = (GetOnboardingContentPageQuery.Image) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12506a);
            GetOnboardingContentPageQuery.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
            GetOnboardingContentPageQuery.OnCoreIcon onCoreIcon = value.c;
            if (onCoreIcon != null) {
                OnCoreIcon.b(writer, customScalarAdapters, onCoreIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$OnCoreIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnCoreIcon;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon implements Adapter<GetOnboardingContentPageQuery.OnCoreIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12523a = CollectionsKt.Q("coreIconName");

        public static GetOnboardingContentPageQuery.OnCoreIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12523a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new GetOnboardingContentPageQuery.OnCoreIcon(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOnboardingContentPageQuery.OnCoreIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12507a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOnboardingContentPageQuery.OnCoreIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$OnCoreIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnCoreIcon1;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon1 implements Adapter<GetOnboardingContentPageQuery.OnCoreIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12524a = CollectionsKt.Q("coreIconName");

        public static GetOnboardingContentPageQuery.OnCoreIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12524a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new GetOnboardingContentPageQuery.OnCoreIcon1(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOnboardingContentPageQuery.OnCoreIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12508a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOnboardingContentPageQuery.OnCoreIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnHostedIcon;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OnHostedIcon implements Adapter<GetOnboardingContentPageQuery.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12525a = CollectionsKt.Q("url");

        public static GetOnboardingContentPageQuery.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12525a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new GetOnboardingContentPageQuery.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOnboardingContentPageQuery.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12509a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOnboardingContentPageQuery.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$OnHostedIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnHostedIcon1;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OnHostedIcon1 implements Adapter<GetOnboardingContentPageQuery.OnHostedIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12526a = CollectionsKt.Q("url");

        public static GetOnboardingContentPageQuery.OnHostedIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12526a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new GetOnboardingContentPageQuery.OnHostedIcon1(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOnboardingContentPageQuery.OnHostedIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12510a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOnboardingContentPageQuery.OnHostedIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$OnOnboardingVerticalContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$OnOnboardingVerticalContent;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OnOnboardingVerticalContent implements Adapter<GetOnboardingContentPageQuery.OnOnboardingVerticalContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12527a = CollectionsKt.Q("rows");

        public static GetOnboardingContentPageQuery.OnOnboardingVerticalContent a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListA = null;
            while (reader.o2(f12527a) == 0) {
                arrayListA = Adapters.a(Adapters.b(Adapters.c(Row.f12528a, false))).fromJson(reader, customScalarAdapters);
            }
            if (arrayListA != null) {
                return new GetOnboardingContentPageQuery.OnOnboardingVerticalContent(arrayListA);
            }
            Assertions.a(reader, "rows");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOnboardingContentPageQuery.OnOnboardingVerticalContent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rows");
            Adapters.a(Adapters.b(Adapters.c(Row.f12528a, false))).toJson(writer, customScalarAdapters, value.f12511a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOnboardingContentPageQuery.OnOnboardingVerticalContent) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/adapter/GetOnboardingContentPageQuery_ResponseAdapter$Row;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/GetOnboardingContentPageQuery$Row;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Row implements Adapter<GetOnboardingContentPageQuery.Row> {

        /* renamed from: a, reason: collision with root package name */
        public static final Row f12528a = new Row();
        public static final List b = CollectionsKt.R(BarcodePickDeserializer.FIELD_ICON, "title", NotificationMessage.NOTIF_KEY_SUB_TITLE);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOnboardingContentPageQuery.Icon icon = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    icon = (GetOnboardingContentPageQuery.Icon) Adapters.c(Icon.f12521a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (icon == null) {
                Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new GetOnboardingContentPageQuery.Row(icon, str, str2);
            }
            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOnboardingContentPageQuery.Row value = (GetOnboardingContentPageQuery.Row) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f12521a, true).toJson(writer, customScalarAdapters, value.f12512a);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
