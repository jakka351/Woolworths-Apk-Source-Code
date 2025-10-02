package au.com.woolworths.sdui.shop.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.sdui.shop.fragment.CoreRowUI;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUIImpl_ResponseAdapter;", "", "CoreRowUI", "LeadingAsset", "OnHostedIcon", "OnCoreIcon", "TrailingAsset", "OnHostedIcon1", "OnCoreIcon1", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreRowUIImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUIImpl_ResponseAdapter$CoreRowUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreRowUI;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreRowUI implements Adapter<au.com.woolworths.sdui.shop.fragment.CoreRowUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10051a = CollectionsKt.R("overlineText", "leadingAsset", lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL, "trailingAsset", "trailingText");

        public static au.com.woolworths.sdui.shop.fragment.CoreRowUI a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CoreRowUI.LeadingAsset leadingAsset = null;
            String str2 = null;
            String str3 = null;
            CoreRowUI.TrailingAsset trailingAsset = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f10051a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    leadingAsset = (CoreRowUI.LeadingAsset) Adapters.b(Adapters.c(LeadingAsset.f10052a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    trailingAsset = (CoreRowUI.TrailingAsset) Adapters.b(Adapters.c(TrailingAsset.f10057a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 != null) {
                return new au.com.woolworths.sdui.shop.fragment.CoreRowUI(str, leadingAsset, str2, str3, trailingAsset, str4);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.sdui.shop.fragment.CoreRowUI value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("overlineText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f10044a);
            writer.F1("leadingAsset");
            Adapters.b(Adapters.c(LeadingAsset.f10052a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.d);
            writer.F1("trailingAsset");
            Adapters.b(Adapters.c(TrailingAsset.f10057a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("trailingText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.sdui.shop.fragment.CoreRowUI) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUIImpl_ResponseAdapter$LeadingAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$LeadingAsset;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeadingAsset implements Adapter<CoreRowUI.LeadingAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeadingAsset f10052a = new LeadingAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CoreRowUI.OnHostedIcon onHostedIconA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CoreRowUI.OnCoreIcon onCoreIconA = null;
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
            return new CoreRowUI.LeadingAsset(str, onHostedIconA, onCoreIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreRowUI.LeadingAsset value = (CoreRowUI.LeadingAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10045a);
            CoreRowUI.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
            CoreRowUI.OnCoreIcon onCoreIcon = value.c;
            if (onCoreIcon != null) {
                OnCoreIcon.b(writer, customScalarAdapters, onCoreIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUIImpl_ResponseAdapter$OnCoreIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$OnCoreIcon;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon implements Adapter<CoreRowUI.OnCoreIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10053a = CollectionsKt.Q("coreIconName");

        public static CoreRowUI.OnCoreIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10053a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CoreRowUI.OnCoreIcon(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CoreRowUI.OnCoreIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10046a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CoreRowUI.OnCoreIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUIImpl_ResponseAdapter$OnCoreIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$OnCoreIcon1;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon1 implements Adapter<CoreRowUI.OnCoreIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10054a = CollectionsKt.Q("coreIconName");

        public static CoreRowUI.OnCoreIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10054a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CoreRowUI.OnCoreIcon1(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CoreRowUI.OnCoreIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10047a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CoreRowUI.OnCoreIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUIImpl_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$OnHostedIcon;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<CoreRowUI.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10055a = CollectionsKt.Q("url");

        public static CoreRowUI.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10055a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CoreRowUI.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CoreRowUI.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10048a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CoreRowUI.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUIImpl_ResponseAdapter$OnHostedIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$OnHostedIcon1;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon1 implements Adapter<CoreRowUI.OnHostedIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10056a = CollectionsKt.Q("url");

        public static CoreRowUI.OnHostedIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10056a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CoreRowUI.OnHostedIcon1(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CoreRowUI.OnHostedIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10049a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CoreRowUI.OnHostedIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreRowUIImpl_ResponseAdapter$TrailingAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreRowUI$TrailingAsset;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TrailingAsset implements Adapter<CoreRowUI.TrailingAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrailingAsset f10057a = new TrailingAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CoreRowUI.OnHostedIcon1 onHostedIcon1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CoreRowUI.OnCoreIcon1 onCoreIcon1A = null;
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
            return new CoreRowUI.TrailingAsset(str, onHostedIcon1A, onCoreIcon1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreRowUI.TrailingAsset value = (CoreRowUI.TrailingAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10050a);
            CoreRowUI.OnHostedIcon1 onHostedIcon1 = value.b;
            if (onHostedIcon1 != null) {
                OnHostedIcon1.b(writer, customScalarAdapters, onHostedIcon1);
            }
            CoreRowUI.OnCoreIcon1 onCoreIcon1 = value.c;
            if (onCoreIcon1 != null) {
                OnCoreIcon1.b(writer, customScalarAdapters, onCoreIcon1);
            }
        }
    }
}
