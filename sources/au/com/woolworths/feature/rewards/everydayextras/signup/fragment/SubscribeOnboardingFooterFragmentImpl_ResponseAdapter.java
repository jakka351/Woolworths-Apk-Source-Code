package au.com.woolworths.feature.rewards.everydayextras.signup.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragmentImpl_ResponseAdapter;", "", "SubscribeOnboardingFooterFragment", "FooterItem", "OnContentCta", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscribeOnboardingFooterFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragmentImpl_ResponseAdapter$FooterItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragment$FooterItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterItem implements Adapter<SubscribeOnboardingFooterFragment.FooterItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterItem f6203a = new FooterItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubscribeOnboardingFooterFragment.OnContentCta onContentCtaA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ContentCta"))) {
                reader.o();
                onContentCtaA = OnContentCta.a(reader, customScalarAdapters);
            }
            return new SubscribeOnboardingFooterFragment.FooterItem(str, onContentCtaA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubscribeOnboardingFooterFragment.FooterItem value = (SubscribeOnboardingFooterFragment.FooterItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f6201a);
            SubscribeOnboardingFooterFragment.OnContentCta onContentCta = value.b;
            if (onContentCta != null) {
                OnContentCta.b(writer, customScalarAdapters, onContentCta);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragmentImpl_ResponseAdapter$OnContentCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragment$OnContentCta;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnContentCta implements Adapter<SubscribeOnboardingFooterFragment.OnContentCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6204a = CollectionsKt.R("__typename", AnnotatedPrivateKey.LABEL, "url");

        public static SubscribeOnboardingFooterFragment.OnContentCta a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f6204a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new SubscribeOnboardingFooterFragment.OnContentCta(str, str2, str3);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SubscribeOnboardingFooterFragment.OnContentCta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6202a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SubscribeOnboardingFooterFragment.OnContentCta) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragmentImpl_ResponseAdapter$SubscribeOnboardingFooterFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingFooterFragment;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubscribeOnboardingFooterFragment implements Adapter<au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6205a = CollectionsKt.R("__typename", "id", "footerItems");

        public static au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f6205a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(FooterItem.f6203a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "footerItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6200a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("footerItems");
            Adapters.a(Adapters.c(FooterItem.f6203a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment) obj);
        }
    }
}
