package au.com.woolworths.feature.rewards.everydayextras.signup.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSubscribeLegacyMutation;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragmentImpl_ResponseAdapter;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragmentImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSubscribeLegacyMutation_ResponseAdapter;", "", "Data", "EverydayExtraSubscribe", "Content", "Footer", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasSubscribeLegacyMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSubscribeLegacyMutation_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$Content;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<EverydayExtrasSubscribeLegacyMutation.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f6044a = new Content();
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
            SubscribeOnboardingContentFragment subscribeOnboardingContentFragmentA = SubscribeOnboardingContentFragmentImpl_ResponseAdapter.SubscribeOnboardingContentFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new EverydayExtrasSubscribeLegacyMutation.Content(str, subscribeOnboardingContentFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSubscribeLegacyMutation.Content value = (EverydayExtrasSubscribeLegacyMutation.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5945a);
            List list = SubscribeOnboardingContentFragmentImpl_ResponseAdapter.SubscribeOnboardingContentFragment.f6199a;
            SubscribeOnboardingContentFragmentImpl_ResponseAdapter.SubscribeOnboardingContentFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSubscribeLegacyMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<EverydayExtrasSubscribeLegacyMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f6045a = new Data();
        public static final List b = CollectionsKt.Q("everydayExtraSubscribe");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtrasSubscribeLegacyMutation.EverydayExtraSubscribe everydayExtraSubscribe = null;
            while (reader.o2(b) == 0) {
                everydayExtraSubscribe = (EverydayExtrasSubscribeLegacyMutation.EverydayExtraSubscribe) Adapters.c(EverydayExtraSubscribe.f6046a, false).fromJson(reader, customScalarAdapters);
            }
            if (everydayExtraSubscribe != null) {
                return new EverydayExtrasSubscribeLegacyMutation.Data(everydayExtraSubscribe);
            }
            Assertions.a(reader, "everydayExtraSubscribe");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSubscribeLegacyMutation.Data value = (EverydayExtrasSubscribeLegacyMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("everydayExtraSubscribe");
            Adapters.c(EverydayExtraSubscribe.f6046a, false).toJson(writer, customScalarAdapters, value.f5946a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSubscribeLegacyMutation_ResponseAdapter$EverydayExtraSubscribe;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$EverydayExtraSubscribe;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EverydayExtraSubscribe implements Adapter<EverydayExtrasSubscribeLegacyMutation.EverydayExtraSubscribe> {

        /* renamed from: a, reason: collision with root package name */
        public static final EverydayExtraSubscribe f6046a = new EverydayExtraSubscribe();
        public static final List b = CollectionsKt.R("content", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtrasSubscribeLegacyMutation.Content content = null;
            EverydayExtrasSubscribeLegacyMutation.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    content = (EverydayExtrasSubscribeLegacyMutation.Content) Adapters.c(Content.f6044a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    footer = (EverydayExtrasSubscribeLegacyMutation.Footer) Adapters.c(Footer.f6047a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (content == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (footer != null) {
                return new EverydayExtrasSubscribeLegacyMutation.EverydayExtraSubscribe(content, footer);
            }
            Assertions.a(reader, "footer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSubscribeLegacyMutation.EverydayExtraSubscribe value = (EverydayExtrasSubscribeLegacyMutation.EverydayExtraSubscribe) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.c(Content.f6044a, true).toJson(writer, customScalarAdapters, value.f5947a);
            writer.F1("footer");
            Adapters.c(Footer.f6047a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSubscribeLegacyMutation_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$Footer;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<EverydayExtrasSubscribeLegacyMutation.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f6047a = new Footer();
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
            SubscribeOnboardingFooterFragment subscribeOnboardingFooterFragmentA = SubscribeOnboardingFooterFragmentImpl_ResponseAdapter.SubscribeOnboardingFooterFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new EverydayExtrasSubscribeLegacyMutation.Footer(str, subscribeOnboardingFooterFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSubscribeLegacyMutation.Footer value = (EverydayExtrasSubscribeLegacyMutation.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5948a);
            List list = SubscribeOnboardingFooterFragmentImpl_ResponseAdapter.SubscribeOnboardingFooterFragment.f6205a;
            SubscribeOnboardingFooterFragmentImpl_ResponseAdapter.SubscribeOnboardingFooterFragment.b(writer, customScalarAdapters, value.b);
        }
    }
}
