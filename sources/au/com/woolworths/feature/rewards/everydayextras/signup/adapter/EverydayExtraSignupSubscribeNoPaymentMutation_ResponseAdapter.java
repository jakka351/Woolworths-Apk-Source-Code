package au.com.woolworths.feature.rewards.everydayextras.signup.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeNoPaymentMutation;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragmentImpl_ResponseAdapter;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragmentImpl_ResponseAdapter;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragmentImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter;", "", "Data", "EverydayExtraSignupSubscribeNoPayment", "OnEverydayExtraOnboarding", "Content", "Footer", "OnEverydayExtraSubscribeAlertDialog", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$Content;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<EverydayExtraSignupSubscribeNoPaymentMutation.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f5978a = new Content();
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
                return new EverydayExtraSignupSubscribeNoPaymentMutation.Content(str, subscribeOnboardingContentFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtraSignupSubscribeNoPaymentMutation.Content value = (EverydayExtraSignupSubscribeNoPaymentMutation.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5858a);
            List list = SubscribeOnboardingContentFragmentImpl_ResponseAdapter.SubscribeOnboardingContentFragment.f6199a;
            SubscribeOnboardingContentFragmentImpl_ResponseAdapter.SubscribeOnboardingContentFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<EverydayExtraSignupSubscribeNoPaymentMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f5979a = new Data();
        public static final List b = CollectionsKt.Q("everydayExtraSignupSubscribeNoPayment");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtraSignupSubscribeNoPaymentMutation.EverydayExtraSignupSubscribeNoPayment everydayExtraSignupSubscribeNoPayment = null;
            while (reader.o2(b) == 0) {
                everydayExtraSignupSubscribeNoPayment = (EverydayExtraSignupSubscribeNoPaymentMutation.EverydayExtraSignupSubscribeNoPayment) Adapters.c(EverydayExtraSignupSubscribeNoPayment.f5980a, true).fromJson(reader, customScalarAdapters);
            }
            if (everydayExtraSignupSubscribeNoPayment != null) {
                return new EverydayExtraSignupSubscribeNoPaymentMutation.Data(everydayExtraSignupSubscribeNoPayment);
            }
            Assertions.a(reader, "everydayExtraSignupSubscribeNoPayment");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtraSignupSubscribeNoPaymentMutation.Data value = (EverydayExtraSignupSubscribeNoPaymentMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("everydayExtraSignupSubscribeNoPayment");
            Adapters.c(EverydayExtraSignupSubscribeNoPayment.f5980a, true).toJson(writer, customScalarAdapters, value.f5859a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter$EverydayExtraSignupSubscribeNoPayment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$EverydayExtraSignupSubscribeNoPayment;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EverydayExtraSignupSubscribeNoPayment implements Adapter<EverydayExtraSignupSubscribeNoPaymentMutation.EverydayExtraSignupSubscribeNoPayment> {

        /* renamed from: a, reason: collision with root package name */
        public static final EverydayExtraSignupSubscribeNoPayment f5980a = new EverydayExtraSignupSubscribeNoPayment();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraOnboarding onEverydayExtraOnboardingA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraSubscribeAlertDialog onEverydayExtraSubscribeAlertDialogA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraOnboarding"))) {
                reader.o();
                onEverydayExtraOnboardingA = OnEverydayExtraOnboarding.a(reader, customScalarAdapters);
            } else {
                onEverydayExtraOnboardingA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraSubscribeAlertDialog"))) {
                reader.o();
                onEverydayExtraSubscribeAlertDialogA = OnEverydayExtraSubscribeAlertDialog.a(reader, customScalarAdapters);
            }
            return new EverydayExtraSignupSubscribeNoPaymentMutation.EverydayExtraSignupSubscribeNoPayment(str, onEverydayExtraOnboardingA, onEverydayExtraSubscribeAlertDialogA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtraSignupSubscribeNoPaymentMutation.EverydayExtraSignupSubscribeNoPayment value = (EverydayExtraSignupSubscribeNoPaymentMutation.EverydayExtraSignupSubscribeNoPayment) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5860a);
            EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraOnboarding onEverydayExtraOnboarding = value.b;
            if (onEverydayExtraOnboarding != null) {
                OnEverydayExtraOnboarding.b(writer, customScalarAdapters, onEverydayExtraOnboarding);
            }
            EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraSubscribeAlertDialog onEverydayExtraSubscribeAlertDialog = value.c;
            if (onEverydayExtraSubscribeAlertDialog != null) {
                OnEverydayExtraSubscribeAlertDialog.b(writer, customScalarAdapters, onEverydayExtraSubscribeAlertDialog);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$Footer;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<EverydayExtraSignupSubscribeNoPaymentMutation.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f5981a = new Footer();
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
                return new EverydayExtraSignupSubscribeNoPaymentMutation.Footer(str, subscribeOnboardingFooterFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtraSignupSubscribeNoPaymentMutation.Footer value = (EverydayExtraSignupSubscribeNoPaymentMutation.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5861a);
            List list = SubscribeOnboardingFooterFragmentImpl_ResponseAdapter.SubscribeOnboardingFooterFragment.f6205a;
            SubscribeOnboardingFooterFragmentImpl_ResponseAdapter.SubscribeOnboardingFooterFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter$OnEverydayExtraOnboarding;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$OnEverydayExtraOnboarding;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraOnboarding implements Adapter<EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraOnboarding> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5982a = CollectionsKt.R("content", "showConfetti", "footer");

        public static EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraOnboarding a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtraSignupSubscribeNoPaymentMutation.Content content = null;
            Boolean bool = null;
            EverydayExtraSignupSubscribeNoPaymentMutation.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(f5982a);
                if (iO2 == 0) {
                    content = (EverydayExtraSignupSubscribeNoPaymentMutation.Content) Adapters.c(Content.f5978a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (EverydayExtraSignupSubscribeNoPaymentMutation.Footer) Adapters.c(Footer.f5981a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (content == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "showConfetti");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (footer != null) {
                return new EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraOnboarding(content, zBooleanValue, footer);
            }
            Assertions.a(reader, "footer");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraOnboarding value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.c(Content.f5978a, true).toJson(writer, customScalarAdapters, value.f5862a);
            writer.F1("showConfetti");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "footer");
            Adapters.c(Footer.f5981a, true).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraOnboarding) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter$OnEverydayExtraSubscribeAlertDialog;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$OnEverydayExtraSubscribeAlertDialog;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraSubscribeAlertDialog implements Adapter<EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraSubscribeAlertDialog> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5983a = CollectionsKt.Q("__typename");

        public static EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraSubscribeAlertDialog a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f5983a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            SubscribeAlertDialogFragment subscribeAlertDialogFragmentA = SubscribeAlertDialogFragmentImpl_ResponseAdapter.SubscribeAlertDialogFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraSubscribeAlertDialog(str, subscribeAlertDialogFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraSubscribeAlertDialog value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5863a);
            List list = SubscribeAlertDialogFragmentImpl_ResponseAdapter.SubscribeAlertDialogFragment.f6183a;
            SubscribeAlertDialogFragmentImpl_ResponseAdapter.SubscribeAlertDialogFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraSubscribeAlertDialog) obj);
        }
    }
}
