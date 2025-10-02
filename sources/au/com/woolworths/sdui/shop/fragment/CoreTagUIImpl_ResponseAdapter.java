package au.com.woolworths.sdui.shop.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.CompatibleColorImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.sdui.shop.fragment.IconFragmentImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUIImpl_ResponseAdapter;", "", "CoreTagUI", "CoreColorTheme", "Background", "Foreground", "Primary", "Secondary", "Highlight", "Icon", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreTagUIImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUIImpl_ResponseAdapter$Background;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Background;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Background implements Adapter<CoreTagUI.Background> {

        /* renamed from: a, reason: collision with root package name */
        public static final Background f10066a = new Background();
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
            CompatibleColor compatibleColorA = CompatibleColorImpl_ResponseAdapter.CompatibleColor.a(reader, customScalarAdapters);
            if (str != null) {
                return new CoreTagUI.Background(str, compatibleColorA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreTagUI.Background value = (CoreTagUI.Background) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10059a);
            List list = CompatibleColorImpl_ResponseAdapter.CompatibleColor.f10043a;
            CompatibleColorImpl_ResponseAdapter.CompatibleColor.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUIImpl_ResponseAdapter$CoreColorTheme;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$CoreColorTheme;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreColorTheme implements Adapter<CoreTagUI.CoreColorTheme> {

        /* renamed from: a, reason: collision with root package name */
        public static final CoreColorTheme f10067a = new CoreColorTheme();
        public static final List b = CollectionsKt.R("__typename", "background", "foreground");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CoreTagUI.Background background = null;
            CoreTagUI.Foreground foreground = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    background = (CoreTagUI.Background) Adapters.c(Background.f10066a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    foreground = (CoreTagUI.Foreground) Adapters.c(Foreground.f10069a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (background == null) {
                Assertions.a(reader, "background");
                throw null;
            }
            if (foreground != null) {
                return new CoreTagUI.CoreColorTheme(str, background, foreground);
            }
            Assertions.a(reader, "foreground");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreTagUI.CoreColorTheme value = (CoreTagUI.CoreColorTheme) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10060a);
            writer.F1("background");
            Adapters.c(Background.f10066a, true).toJson(writer, customScalarAdapters, value.b);
            writer.F1("foreground");
            Adapters.c(Foreground.f10069a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUIImpl_ResponseAdapter$CoreTagUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreTagUI;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreTagUI implements Adapter<au.com.woolworths.sdui.shop.fragment.CoreTagUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10068a = CollectionsKt.R("__typename", AnnotatedPrivateKey.LABEL, "coreColorTheme", "hasBorder", BarcodePickDeserializer.FIELD_ICON);

        public static au.com.woolworths.sdui.shop.fragment.CoreTagUI a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            CoreTagUI.CoreColorTheme coreColorTheme = null;
            CoreTagUI.Icon icon = null;
            while (true) {
                int iO2 = reader.o2(f10068a);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    coreColorTheme = (CoreTagUI.CoreColorTheme) Adapters.c(CoreColorTheme.f10067a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    icon = (CoreTagUI.Icon) Adapters.b(Adapters.c(Icon.f10071a, true)).fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (coreColorTheme == null) {
                Assertions.a(reader, "coreColorTheme");
                throw null;
            }
            if (bool3 != null) {
                return new au.com.woolworths.sdui.shop.fragment.CoreTagUI(str, str2, coreColorTheme, bool3.booleanValue(), icon);
            }
            Assertions.a(reader, "hasBorder");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.sdui.shop.fragment.CoreTagUI value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10058a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("coreColorTheme");
            Adapters.c(CoreColorTheme.f10067a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("hasBorder");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, BarcodePickDeserializer.FIELD_ICON);
            Adapters.b(Adapters.c(Icon.f10071a, true)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.sdui.shop.fragment.CoreTagUI) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUIImpl_ResponseAdapter$Foreground;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Foreground;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Foreground implements Adapter<CoreTagUI.Foreground> {

        /* renamed from: a, reason: collision with root package name */
        public static final Foreground f10069a = new Foreground();
        public static final List b = CollectionsKt.R("__typename", "primary", "secondary", "highlight");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CoreTagUI.Primary primary = null;
            CoreTagUI.Secondary secondary = null;
            CoreTagUI.Highlight highlight = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    primary = (CoreTagUI.Primary) Adapters.c(Primary.f10072a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    secondary = (CoreTagUI.Secondary) Adapters.c(Secondary.f10073a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    highlight = (CoreTagUI.Highlight) Adapters.c(Highlight.f10070a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (primary == null) {
                Assertions.a(reader, "primary");
                throw null;
            }
            if (secondary == null) {
                Assertions.a(reader, "secondary");
                throw null;
            }
            if (highlight != null) {
                return new CoreTagUI.Foreground(str, primary, secondary, highlight);
            }
            Assertions.a(reader, "highlight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreTagUI.Foreground value = (CoreTagUI.Foreground) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10061a);
            writer.F1("primary");
            Adapters.c(Primary.f10072a, true).toJson(writer, customScalarAdapters, value.b);
            writer.F1("secondary");
            Adapters.c(Secondary.f10073a, true).toJson(writer, customScalarAdapters, value.c);
            writer.F1("highlight");
            Adapters.c(Highlight.f10070a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUIImpl_ResponseAdapter$Highlight;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Highlight;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Highlight implements Adapter<CoreTagUI.Highlight> {

        /* renamed from: a, reason: collision with root package name */
        public static final Highlight f10070a = new Highlight();
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
            CompatibleColor compatibleColorA = CompatibleColorImpl_ResponseAdapter.CompatibleColor.a(reader, customScalarAdapters);
            if (str != null) {
                return new CoreTagUI.Highlight(str, compatibleColorA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreTagUI.Highlight value = (CoreTagUI.Highlight) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10062a);
            List list = CompatibleColorImpl_ResponseAdapter.CompatibleColor.f10043a;
            CompatibleColorImpl_ResponseAdapter.CompatibleColor.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUIImpl_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Icon;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<CoreTagUI.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f10071a = new Icon();
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
            IconFragment iconFragmentA = IconFragmentImpl_ResponseAdapter.IconFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new CoreTagUI.Icon(str, iconFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreTagUI.Icon value = (CoreTagUI.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10063a);
            List list = IconFragmentImpl_ResponseAdapter.IconFragment.f10077a;
            IconFragmentImpl_ResponseAdapter.IconFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUIImpl_ResponseAdapter$Primary;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Primary;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Primary implements Adapter<CoreTagUI.Primary> {

        /* renamed from: a, reason: collision with root package name */
        public static final Primary f10072a = new Primary();
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
            CompatibleColor compatibleColorA = CompatibleColorImpl_ResponseAdapter.CompatibleColor.a(reader, customScalarAdapters);
            if (str != null) {
                return new CoreTagUI.Primary(str, compatibleColorA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreTagUI.Primary value = (CoreTagUI.Primary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10064a);
            List list = CompatibleColorImpl_ResponseAdapter.CompatibleColor.f10043a;
            CompatibleColorImpl_ResponseAdapter.CompatibleColor.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CoreTagUIImpl_ResponseAdapter$Secondary;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/shop/fragment/CoreTagUI$Secondary;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Secondary implements Adapter<CoreTagUI.Secondary> {

        /* renamed from: a, reason: collision with root package name */
        public static final Secondary f10073a = new Secondary();
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
            CompatibleColor compatibleColorA = CompatibleColorImpl_ResponseAdapter.CompatibleColor.a(reader, customScalarAdapters);
            if (str != null) {
                return new CoreTagUI.Secondary(str, compatibleColorA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreTagUI.Secondary value = (CoreTagUI.Secondary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10065a);
            List list = CompatibleColorImpl_ResponseAdapter.CompatibleColor.f10043a;
            CompatibleColorImpl_ResponseAdapter.CompatibleColor.b(writer, customScalarAdapters, value.b);
        }
    }
}
