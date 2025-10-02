package au.com.woolworths.feature.rewards.everydayextras.signup.selections;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcel;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.epoxy.ItemSpacerEpoxyModel;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsController;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import com.apollographql.apollo.api.CompiledCondition;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledNotNullType;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EnumType;
import com.apollographql.apollo.api.InterfaceType;
import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static void A(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    public static void B(Object[] objArr, int i, String str, TextView textView) {
        textView.setText(String.format(str, Arrays.copyOf(objArr, i)));
    }

    public static boolean C(int i, Composer composer, Function1 function1) {
        composer.l();
        composer.o(i);
        return composer.n(function1);
    }

    public static boolean D(Composer composer, int i, OrderDetailsController orderDetailsController) {
        composer.l();
        composer.o(i);
        return composer.I(orderDetailsController);
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        return i + i2 + i3 + i4 + i5;
    }

    public static int b(Optional.Present present, int i, int i2) {
        return (present.hashCode() + i) * i2;
    }

    public static int c(Optional optional, int i, int i2) {
        return (optional.hashCode() + i) * i2;
    }

    public static CompiledField d(String str, EnumType enumType) {
        return new CompiledField.Builder(str, enumType).c();
    }

    public static CompiledNotNullType e(CustomScalarType customScalarType) {
        return CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(customScalarType)));
    }

    public static CompiledNotNullType f(ObjectType objectType) {
        return CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(objectType)));
    }

    public static InterfaceType g(String str) {
        return new InterfaceType.Builder(str).a();
    }

    public static ObjectType h(String str) {
        return new ObjectType.Builder(str).a();
    }

    public static IObjectWrapper i(Parcel parcel) {
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperAsInterface;
    }

    public static IllegalStateException j(JsonReader jsonReader, String str, CustomScalarAdapters customScalarAdapters, String str2, String str3) {
        Intrinsics.h(jsonReader, str);
        Intrinsics.h(customScalarAdapters, str2);
        return new IllegalStateException(str3);
    }

    public static String k(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    public static String l(IllegalArgumentException illegalArgumentException, StringBuilder sb) {
        sb.append(illegalArgumentException.getMessage());
        return sb.toString();
    }

    public static String m(String str, ListDetailsAnalyticsParams listDetailsAnalyticsParams, String str2) {
        return str + listDetailsAnalyticsParams + str2;
    }

    public static String n(StringBuilder sb, ButtonStyle buttonStyle, String str, boolean z, String str2) {
        sb.append(buttonStyle);
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        return sb.toString();
    }

    public static String o(StringBuilder sb, Optional optional, String str) {
        sb.append(optional);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder p(String str, Optional optional, String str2, Optional optional2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(optional);
        sb.append(str2);
        sb.append(optional2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, ButtonStyle buttonStyle, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(buttonStyle);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, Optional optional, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(optional);
        sb.append(str4);
        return sb;
    }

    public static List s(String str, boolean z) {
        return CollectionsKt.Q(new CompiledCondition(str, z));
    }

    public static void t(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void u(MediaMetadataRetriever mediaMetadataRetriever) throws Exception {
        boolean zIsTerminated;
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
            return;
        }
        if (!(mediaMetadataRetriever instanceof ExecutorService)) {
            mediaMetadataRetriever.release();
            return;
        }
        ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void v(Bundle bundle, String str) {
        bundle.putLong(str, zzt.zzk().currentTimeMillis());
    }

    public static void w(ItemSpacerEpoxyModel itemSpacerEpoxyModel, String str, String str2, int i) {
        Intrinsics.h(itemSpacerEpoxyModel, str);
        itemSpacerEpoxyModel.p(str2);
        itemSpacerEpoxyModel.D(i);
    }

    public static void x(StringBuilder sb, Optional optional, String str, Optional optional2, String str2) {
        sb.append(optional);
        sb.append(str);
        sb.append(optional2);
        sb.append(str2);
    }

    public static void y(StringBuilder sb, Optional optional, String str, boolean z, String str2) {
        sb.append(optional);
        sb.append(str);
        sb.append(z);
        sb.append(str2);
    }

    public static void z(StringBuilder sb, boolean z, String str, Optional optional, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(optional);
        sb.append(str2);
    }
}
