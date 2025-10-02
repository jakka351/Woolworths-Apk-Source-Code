package au.com.woolworths.feature.rewards.everydayextras.signup.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragmentImpl_ResponseAdapter;", "", "SubscribeAlertDialogFragment", "PrimaryCta", "SecondaryCta", "Analytics", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscribeAlertDialogFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragmentImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragment$Analytics;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<SubscribeAlertDialogFragment.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f6180a = new Analytics();
        public static final List b = CollectionsKt.R("eventCategory", "eventDescription");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "eventCategory");
                throw null;
            }
            if (str2 != null) {
                return new SubscribeAlertDialogFragment.Analytics(str, str2);
            }
            Assertions.a(reader, "eventDescription");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubscribeAlertDialogFragment.Analytics value = (SubscribeAlertDialogFragment.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("eventCategory");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6177a);
            writer.F1("eventDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragmentImpl_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragment$PrimaryCta;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<SubscribeAlertDialogFragment.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f6181a = new PrimaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new SubscribeAlertDialogFragment.PrimaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubscribeAlertDialogFragment.PrimaryCta value = (SubscribeAlertDialogFragment.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f6178a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragmentImpl_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragment$SecondaryCta;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<SubscribeAlertDialogFragment.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f6182a = new SecondaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new SubscribeAlertDialogFragment.SecondaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubscribeAlertDialogFragment.SecondaryCta value = (SubscribeAlertDialogFragment.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f6179a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragmentImpl_ResponseAdapter$SubscribeAlertDialogFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragment;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubscribeAlertDialogFragment implements Adapter<au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6183a = CollectionsKt.R("__typename", "resetPaymentForm", "title", "message", "primaryCta", "secondaryCta", "analytics");

        public static au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            SubscribeAlertDialogFragment.PrimaryCta primaryCta = null;
            SubscribeAlertDialogFragment.SecondaryCta secondaryCta = null;
            SubscribeAlertDialogFragment.Analytics analytics = null;
            while (true) {
                switch (reader.o2(f6183a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        primaryCta = (SubscribeAlertDialogFragment.PrimaryCta) Adapters.c(PrimaryCta.f6181a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        secondaryCta = (SubscribeAlertDialogFragment.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f6182a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        analytics = (SubscribeAlertDialogFragment.Analytics) Adapters.b(Adapters.c(Analytics.f6180a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "message");
                            throw null;
                        }
                        if (primaryCta != null) {
                            return new au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment(str, bool, str2, str3, primaryCta, secondaryCta, analytics);
                        }
                        Assertions.a(reader, "primaryCta");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6176a);
            writer.F1("resetPaymentForm");
            Adapters.l.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("primaryCta");
            Adapters.c(PrimaryCta.f6181a, false).toJson(writer, customScalarAdapters, value.e);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f6182a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f6180a, false)).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment) obj);
        }
    }
}
