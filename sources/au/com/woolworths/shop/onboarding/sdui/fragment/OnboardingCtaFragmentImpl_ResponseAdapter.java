package au.com.woolworths.shop.onboarding.sdui.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.onboarding.sdui.fragment.OnboardingCtaFragment;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragmentImpl_ResponseAdapter;", "", "OnboardingCtaFragment", "ButtonAction", "Analytics", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnboardingCtaFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragmentImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragment$Analytics;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<OnboardingCtaFragment.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f12532a = new Analytics();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new OnboardingCtaFragment.Analytics(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OnboardingCtaFragment.Analytics value = (OnboardingCtaFragment.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.i.toJson(writer, customScalarAdapters, value.f12530a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragmentImpl_ResponseAdapter$ButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragment$ButtonAction;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ButtonAction implements Adapter<OnboardingCtaFragment.ButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction f12533a = new ButtonAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new OnboardingCtaFragment.ButtonAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OnboardingCtaFragment.ButtonAction value = (OnboardingCtaFragment.ButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f12531a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragmentImpl_ResponseAdapter$OnboardingCtaFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/onboarding/sdui/fragment/OnboardingCtaFragment;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OnboardingCtaFragment implements Adapter<au.com.woolworths.shop.onboarding.sdui.fragment.OnboardingCtaFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12534a = CollectionsKt.R("buttonId", AnnotatedPrivateKey.LABEL, "style", "enabled", "buttonAction", "iconUrl", "altText", "analytics");

        public static au.com.woolworths.shop.onboarding.sdui.fragment.OnboardingCtaFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            OnboardingCtaFragment.ButtonAction buttonAction = null;
            String str3 = null;
            String str4 = null;
            OnboardingCtaFragment.Analytics analytics = null;
            while (true) {
                switch (reader.o2(f12534a)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        buttonAction = (OnboardingCtaFragment.ButtonAction) Adapters.b(Adapters.c(ButtonAction.f12533a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        analytics = (OnboardingCtaFragment.Analytics) Adapters.b(Adapters.c(Analytics.f12532a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str2 == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        if (bool3 != null) {
                            return new au.com.woolworths.shop.onboarding.sdui.fragment.OnboardingCtaFragment(str, str2, buttonStyle, bool3.booleanValue(), buttonAction, str3, str4, analytics);
                        }
                        Assertions.a(reader, "enabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.shop.onboarding.sdui.fragment.OnboardingCtaFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12529a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "buttonAction");
            Adapters.b(Adapters.c(ButtonAction.f12533a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f12532a, false)).toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.shop.onboarding.sdui.fragment.OnboardingCtaFragment) obj);
        }
    }
}
