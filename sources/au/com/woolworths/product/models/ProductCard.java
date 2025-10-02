package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bs\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bã\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0018\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0018\u0012\b\b\u0002\u00102\u001a\u00020\u000f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bA\u0010BJ\n\u0010\u0086\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010IJ\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u001aHÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0012\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0018HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\u0012\u0010¤\u0001\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0018HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jö\u0003\u0010®\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00182\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00182\b\b\u0002\u00102\u001a\u00020\u000f2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0003\u0010¯\u0001J\u0007\u0010°\u0001\u001a\u00020\tJ\u0016\u0010±\u0001\u001a\u00020\u000f2\n\u0010²\u0001\u001a\u0005\u0018\u00010³\u0001HÖ\u0003J\n\u0010´\u0001\u001a\u00020\tHÖ\u0001J\n\u0010µ\u0001\u001a\u00020\u0004HÖ\u0001J\u001b\u0010¶\u0001\u001a\u00030·\u00012\b\u0010¸\u0001\u001a\u00030¹\u00012\u0007\u0010º\u0001\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010DR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010DR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010J\u001a\u0004\bH\u0010IR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010DR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010M\u001a\u0004\bN\u0010DR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010M\u001a\u0004\bP\u0010DR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010DR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010RR\u001c\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010M\u001a\u0004\b\u0010\u0010RR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010DR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010DR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010DR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010DR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010[R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010DR\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010DR\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0018\u0010)\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010DR\u0018\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0018\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0018\u0010.\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u001e\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010[R\u0016\u00102\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010RR\u0018\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0018\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0018\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0018\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0018\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u001c\u0010=\u001a\u0004\u0018\u00010<X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010|\"\u0004\b~\u0010\u007fR\u001a\u0010>\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010@\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010DR\"\u0010\u0083\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018¢\u0006\u0010\n\u0000\u0012\u0005\b\u0084\u0001\u0010M\u001a\u0005\b\u0085\u0001\u0010[¨\u0006»\u0001"}, d2 = {"Lau/com/woolworths/product/models/ProductCard;", "Landroid/os/Parcelable;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "productId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "productImage", "badgeImage", "price", "", "unitOfMeasureLabel", "promotionValue", "promotionType", "unitPriceDescription", "isAvailable", "", "isNew", "wasPrice", "multiBuyPrice", "multiBuyUnitPrice", "purchaseWarning", "trolley", "Lau/com/woolworths/product/models/ProductTrolleyData;", "trolleys", "", "productShoppingList", "Lau/com/woolworths/product/models/ProductShoppingList;", "inStoreDetails", "Lau/com/woolworths/product/models/InstoreDetailsData;", "purchaseRestriction", "Lau/com/woolworths/product/models/PurchaseRestriction;", "inlineLabels", "Lau/com/woolworths/product/models/ProductInlineLabelApiData;", "promotionInfo", "Lau/com/woolworths/android/onesite/models/products/PromotionInfo;", "adId", "source", "marketplace", "Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;", "rewardsOfferInfo", "Lau/com/woolworths/product/models/RewardsOfferInfo;", "disclaimer", "tagLabel", "Lau/com/woolworths/product/models/TagLabel;", "inStoreAvailabilityInfo", "Lau/com/woolworths/product/models/InStoreAvailabilityInfo;", "productVarieties", "Lau/com/woolworths/product/models/ProductVarieties;", "categories", "Lau/com/woolworths/product/models/ProductCategory;", "isTobacco", "multiBuyPriceInfo", "Lau/com/woolworths/product/models/MultiBuyPriceInfo;", "memberPriceInfo", "Lau/com/woolworths/product/models/MemberPriceInfo;", "cartProductInfo", "Lau/com/woolworths/base/shopapp/data/models/CartProductInfo;", "inStoreLocation", "Lau/com/woolworths/product/models/InStoreLocationData;", "productCardAnalytics", "Lau/com/woolworths/analytics/model/AnalyticsData;", "impressionAnalyticsData", "productCardAction", "Lau/com/woolworths/sdui/model/action/ActionData;", "pricingFootnoteMd", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/product/models/ProductTrolleyData;Ljava/util/List;Lau/com/woolworths/product/models/ProductShoppingList;Lau/com/woolworths/product/models/InstoreDetailsData;Lau/com/woolworths/product/models/PurchaseRestriction;Ljava/util/List;Lau/com/woolworths/android/onesite/models/products/PromotionInfo;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;Lau/com/woolworths/product/models/RewardsOfferInfo;Ljava/lang/String;Lau/com/woolworths/product/models/TagLabel;Lau/com/woolworths/product/models/InStoreAvailabilityInfo;Lau/com/woolworths/product/models/ProductVarieties;Ljava/util/List;ZLau/com/woolworths/product/models/MultiBuyPriceInfo;Lau/com/woolworths/product/models/MemberPriceInfo;Lau/com/woolworths/base/shopapp/data/models/CartProductInfo;Lau/com/woolworths/product/models/InStoreLocationData;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/sdui/model/action/ActionData;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getName", "getProductImage", "getBadgeImage", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnitOfMeasureLabel", "getPromotionValue$annotations", "()V", "getPromotionValue", "getPromotionType$annotations", "getPromotionType", "getUnitPriceDescription", "()Z", "isNew$annotations", "getWasPrice", "getMultiBuyPrice", "getMultiBuyUnitPrice", "getPurchaseWarning", "getTrolley", "()Lau/com/woolworths/product/models/ProductTrolleyData;", "getTrolleys", "()Ljava/util/List;", "getProductShoppingList", "()Lau/com/woolworths/product/models/ProductShoppingList;", "getInStoreDetails", "()Lau/com/woolworths/product/models/InstoreDetailsData;", "getPurchaseRestriction", "()Lau/com/woolworths/product/models/PurchaseRestriction;", "getInlineLabels", "getPromotionInfo", "()Lau/com/woolworths/android/onesite/models/products/PromotionInfo;", "getAdId", "getSource", "getMarketplace", "()Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;", "getRewardsOfferInfo", "()Lau/com/woolworths/product/models/RewardsOfferInfo;", "getDisclaimer", "getTagLabel", "()Lau/com/woolworths/product/models/TagLabel;", "getInStoreAvailabilityInfo", "()Lau/com/woolworths/product/models/InStoreAvailabilityInfo;", "getProductVarieties", "()Lau/com/woolworths/product/models/ProductVarieties;", "getCategories", "getMultiBuyPriceInfo", "()Lau/com/woolworths/product/models/MultiBuyPriceInfo;", "getMemberPriceInfo", "()Lau/com/woolworths/product/models/MemberPriceInfo;", "getCartProductInfo", "()Lau/com/woolworths/base/shopapp/data/models/CartProductInfo;", "getInStoreLocation", "()Lau/com/woolworths/product/models/InStoreLocationData;", "getProductCardAnalytics", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "getImpressionAnalyticsData", "setImpressionAnalyticsData", "(Lau/com/woolworths/analytics/model/AnalyticsData;)V", "getProductCardAction", "()Lau/com/woolworths/sdui/model/action/ActionData;", "getPricingFootnoteMd", "trolleySelectorTitleList", "getTrolleySelectorTitleList$annotations", "getTrolleySelectorTitleList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/product/models/ProductTrolleyData;Ljava/util/List;Lau/com/woolworths/product/models/ProductShoppingList;Lau/com/woolworths/product/models/InstoreDetailsData;Lau/com/woolworths/product/models/PurchaseRestriction;Ljava/util/List;Lau/com/woolworths/android/onesite/models/products/PromotionInfo;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;Lau/com/woolworths/product/models/RewardsOfferInfo;Ljava/lang/String;Lau/com/woolworths/product/models/TagLabel;Lau/com/woolworths/product/models/InStoreAvailabilityInfo;Lau/com/woolworths/product/models/ProductVarieties;Ljava/util/List;ZLau/com/woolworths/product/models/MultiBuyPriceInfo;Lau/com/woolworths/product/models/MemberPriceInfo;Lau/com/woolworths/base/shopapp/data/models/CartProductInfo;Lau/com/woolworths/product/models/InStoreLocationData;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/sdui/model/action/ActionData;Ljava/lang/String;)Lau/com/woolworths/product/models/ProductCard;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class ProductCard implements Parcelable, HorizontalListItem {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProductCard> CREATOR = new Creator();

    @SerializedName("adId")
    @Nullable
    private final String adId;

    @SerializedName("badgeImage")
    @Nullable
    private final String badgeImage;

    @SerializedName("cartProductInfo")
    @Nullable
    private final CartProductInfo cartProductInfo;

    @SerializedName("categories")
    @Nullable
    private final List<ProductCategory> categories;

    @SerializedName("disclaimer")
    @Nullable
    private final String disclaimer;

    @Nullable
    private AnalyticsData impressionAnalyticsData;

    @SerializedName("inStoreAvailabilityInfo")
    @Nullable
    private final InStoreAvailabilityInfo inStoreAvailabilityInfo;

    @SerializedName("inStoreDetails")
    @Nullable
    private final InstoreDetailsData inStoreDetails;

    @SerializedName("inStoreLocation")
    @Nullable
    private final InStoreLocationData inStoreLocation;

    @SerializedName("inlineLabels")
    @Nullable
    private final List<ProductInlineLabelApiData> inlineLabels;

    @SerializedName("isAvailable")
    private final boolean isAvailable;

    @SerializedName("isNew")
    private final boolean isNew;

    @SerializedName("isTobacco")
    private final boolean isTobacco;

    @SerializedName("marketplace")
    @Nullable
    private final ProductListMarketplace marketplace;

    @SerializedName("memberPriceInfo")
    @Nullable
    private final MemberPriceInfo memberPriceInfo;

    @SerializedName("multiBuyPrice")
    @Nullable
    private final String multiBuyPrice;

    @SerializedName("multiBuyPriceInfo")
    @Nullable
    private final MultiBuyPriceInfo multiBuyPriceInfo;

    @SerializedName("multiBuyUnitPrice")
    @Nullable
    private final String multiBuyUnitPrice;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("price")
    @Nullable
    private final Integer price;

    @SerializedName("pricingFootnoteMd")
    @Nullable
    private final String pricingFootnoteMd;

    @SerializedName("productCardAction")
    @Nullable
    private final ActionData productCardAction;

    @SerializedName("productCardAnalytics")
    @Nullable
    private final AnalyticsData productCardAnalytics;

    @SerializedName("productId")
    @NotNull
    private final String productId;

    @SerializedName("productImage")
    @Nullable
    private final String productImage;

    @SerializedName("list")
    @MappedName
    @NotNull
    private final ProductShoppingList productShoppingList;

    @SerializedName("productVarieties")
    @Nullable
    private final ProductVarieties productVarieties;

    @SerializedName("promotionInfo")
    @Nullable
    private final PromotionInfo promotionInfo;

    @SerializedName("promotionType")
    @Nullable
    private final String promotionType;

    @SerializedName("promotionValue")
    @Nullable
    private final String promotionValue;

    @SerializedName("purchaseRestriction")
    @Nullable
    private final PurchaseRestriction purchaseRestriction;

    @SerializedName("purchaseWarning")
    @Nullable
    private final String purchaseWarning;

    @SerializedName("rewardsOfferInfo")
    @Nullable
    private final RewardsOfferInfo rewardsOfferInfo;

    @SerializedName("source")
    @Nullable
    private final String source;

    @SerializedName("tagLabel")
    @Nullable
    private final TagLabel tagLabel;

    @SerializedName("trolley")
    @Nullable
    private final ProductTrolleyData trolley;

    @Nullable
    private final List<String> trolleySelectorTitleList;

    @SerializedName("trolleys")
    @Nullable
    private final List<ProductTrolleyData> trolleys;

    @SerializedName("unitOfMeasureLabel")
    @Nullable
    private final String unitOfMeasureLabel;

    @SerializedName("unitPriceDescription")
    @Nullable
    private final String unitPriceDescription;

    @SerializedName("wasPrice")
    @Nullable
    private final String wasPrice;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductCard createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            ProductTrolleyData productTrolleyData;
            ProductShoppingList productShoppingList;
            InstoreDetailsData instoreDetailsData;
            ArrayList arrayList2;
            PurchaseRestriction purchaseRestriction;
            Class cls;
            RewardsOfferInfo rewardsOfferInfoCreateFromParcel;
            RewardsOfferInfo rewardsOfferInfo;
            TagLabel tagLabelCreateFromParcel;
            TagLabel tagLabel;
            InStoreAvailabilityInfo inStoreAvailabilityInfoCreateFromParcel;
            InStoreAvailabilityInfo inStoreAvailabilityInfo;
            ProductVarieties productVarietiesCreateFromParcel;
            ProductVarieties productVarieties;
            ArrayList arrayList3;
            ArrayList arrayList4;
            PromotionInfo promotionInfo;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            boolean z3 = parcel.readInt() != 0 ? true : z;
            String string9 = parcel.readString();
            boolean z4 = z3;
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            ProductTrolleyData productTrolleyDataCreateFromParcel = parcel.readInt() == 0 ? null : ProductTrolleyData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                productTrolleyData = productTrolleyDataCreateFromParcel;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                productTrolleyData = productTrolleyDataCreateFromParcel;
                int iE = 0;
                while (iE != i) {
                    iE = a.e(ProductTrolleyData.CREATOR, parcel, arrayList, iE, 1);
                    i = i;
                    string = string;
                }
            }
            String str = string;
            ProductShoppingList productShoppingListCreateFromParcel = ProductShoppingList.CREATOR.createFromParcel(parcel);
            InstoreDetailsData instoreDetailsDataCreateFromParcel = parcel.readInt() == 0 ? null : InstoreDetailsData.CREATOR.createFromParcel(parcel);
            PurchaseRestriction purchaseRestrictionCreateFromParcel = parcel.readInt() == 0 ? null : PurchaseRestriction.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                productShoppingList = productShoppingListCreateFromParcel;
                instoreDetailsData = instoreDetailsDataCreateFromParcel;
                purchaseRestriction = purchaseRestrictionCreateFromParcel;
                arrayList2 = null;
            } else {
                productShoppingList = productShoppingListCreateFromParcel;
                int i2 = parcel.readInt();
                instoreDetailsData = instoreDetailsDataCreateFromParcel;
                arrayList2 = new ArrayList(i2);
                purchaseRestriction = purchaseRestrictionCreateFromParcel;
                int iE2 = 0;
                while (iE2 != i2) {
                    iE2 = a.e(ProductInlineLabelApiData.CREATOR, parcel, arrayList2, iE2, 1);
                    i2 = i2;
                    string2 = string2;
                }
            }
            String str2 = string2;
            PromotionInfo promotionInfo2 = (PromotionInfo) parcel.readParcelable(ProductCard.class.getClassLoader());
            InstoreDetailsData instoreDetailsData2 = instoreDetailsData;
            String string13 = parcel.readString();
            ArrayList arrayList5 = arrayList;
            ProductTrolleyData productTrolleyData2 = productTrolleyData;
            PurchaseRestriction purchaseRestriction2 = purchaseRestriction;
            String string14 = parcel.readString();
            ProductListMarketplace productListMarketplace = (ProductListMarketplace) parcel.readParcelable(ProductCard.class.getClassLoader());
            if (parcel.readInt() == 0) {
                cls = ProductCard.class;
                rewardsOfferInfoCreateFromParcel = null;
            } else {
                cls = ProductCard.class;
                rewardsOfferInfoCreateFromParcel = RewardsOfferInfo.CREATOR.createFromParcel(parcel);
            }
            RewardsOfferInfo rewardsOfferInfo2 = rewardsOfferInfoCreateFromParcel;
            String string15 = parcel.readString();
            if (parcel.readInt() == 0) {
                rewardsOfferInfo = rewardsOfferInfo2;
                tagLabelCreateFromParcel = null;
            } else {
                rewardsOfferInfo = rewardsOfferInfo2;
                tagLabelCreateFromParcel = TagLabel.CREATOR.createFromParcel(parcel);
            }
            TagLabel tagLabel2 = tagLabelCreateFromParcel;
            if (parcel.readInt() == 0) {
                tagLabel = tagLabel2;
                inStoreAvailabilityInfoCreateFromParcel = null;
            } else {
                tagLabel = tagLabel2;
                inStoreAvailabilityInfoCreateFromParcel = InStoreAvailabilityInfo.CREATOR.createFromParcel(parcel);
            }
            InStoreAvailabilityInfo inStoreAvailabilityInfo2 = inStoreAvailabilityInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                inStoreAvailabilityInfo = inStoreAvailabilityInfo2;
                productVarietiesCreateFromParcel = null;
            } else {
                inStoreAvailabilityInfo = inStoreAvailabilityInfo2;
                productVarietiesCreateFromParcel = ProductVarieties.CREATOR.createFromParcel(parcel);
            }
            ProductVarieties productVarieties2 = productVarietiesCreateFromParcel;
            if (parcel.readInt() == 0) {
                productVarieties = productVarieties2;
                arrayList3 = arrayList2;
                promotionInfo = promotionInfo2;
                arrayList4 = null;
            } else {
                productVarieties = productVarieties2;
                int i3 = parcel.readInt();
                arrayList3 = arrayList2;
                arrayList4 = new ArrayList(i3);
                promotionInfo = promotionInfo2;
                int iE3 = 0;
                while (iE3 != i3) {
                    iE3 = a.e(ProductCategory.CREATOR, parcel, arrayList4, iE3, 1);
                    i3 = i3;
                    productListMarketplace = productListMarketplace;
                }
            }
            ProductListMarketplace productListMarketplace2 = productListMarketplace;
            boolean z5 = true;
            if (parcel.readInt() == 0) {
                z5 = false;
            }
            return new ProductCard(str, str2, string3, string4, numValueOf, string5, string6, string7, string8, z2, z4, string9, string10, string11, string12, productTrolleyData2, arrayList5, productShoppingList, instoreDetailsData2, purchaseRestriction2, arrayList3, promotionInfo, string13, string14, productListMarketplace2, rewardsOfferInfo, string15, tagLabel, inStoreAvailabilityInfo, productVarieties, arrayList4, z5, parcel.readInt() == 0 ? null : MultiBuyPriceInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MemberPriceInfo.CREATOR.createFromParcel(parcel), (CartProductInfo) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() == 0 ? null : InStoreLocationData.CREATOR.createFromParcel(parcel), (AnalyticsData) parcel.readParcelable(cls.getClassLoader()), (AnalyticsData) parcel.readParcelable(cls.getClassLoader()), (ActionData) parcel.readParcelable(cls.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductCard[] newArray(int i) {
            return new ProductCard[i];
        }
    }

    public ProductCard(@NotNull String productId, @NotNull String name, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, boolean z2, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable ProductTrolleyData productTrolleyData, @Nullable List<ProductTrolleyData> list, @NotNull ProductShoppingList productShoppingList, @Nullable InstoreDetailsData instoreDetailsData, @Nullable PurchaseRestriction purchaseRestriction, @Nullable List<ProductInlineLabelApiData> list2, @Nullable PromotionInfo promotionInfo, @Nullable String str11, @Nullable String str12, @Nullable ProductListMarketplace productListMarketplace, @Nullable RewardsOfferInfo rewardsOfferInfo, @Nullable String str13, @Nullable TagLabel tagLabel, @Nullable InStoreAvailabilityInfo inStoreAvailabilityInfo, @Nullable ProductVarieties productVarieties, @Nullable List<ProductCategory> list3, boolean z3, @Nullable MultiBuyPriceInfo multiBuyPriceInfo, @Nullable MemberPriceInfo memberPriceInfo, @Nullable CartProductInfo cartProductInfo, @Nullable InStoreLocationData inStoreLocationData, @Nullable AnalyticsData analyticsData, @Nullable AnalyticsData analyticsData2, @Nullable ActionData actionData, @Nullable String str14) {
        ArrayList arrayList;
        Intrinsics.h(productId, "productId");
        Intrinsics.h(name, "name");
        Intrinsics.h(productShoppingList, "productShoppingList");
        this.productId = productId;
        this.name = name;
        this.productImage = str;
        this.badgeImage = str2;
        this.price = num;
        this.unitOfMeasureLabel = str3;
        this.promotionValue = str4;
        this.promotionType = str5;
        this.unitPriceDescription = str6;
        this.isAvailable = z;
        this.isNew = z2;
        this.wasPrice = str7;
        this.multiBuyPrice = str8;
        this.multiBuyUnitPrice = str9;
        this.purchaseWarning = str10;
        this.trolley = productTrolleyData;
        this.trolleys = list;
        this.productShoppingList = productShoppingList;
        this.inStoreDetails = instoreDetailsData;
        this.purchaseRestriction = purchaseRestriction;
        this.inlineLabels = list2;
        this.promotionInfo = promotionInfo;
        this.adId = str11;
        this.source = str12;
        this.marketplace = productListMarketplace;
        this.rewardsOfferInfo = rewardsOfferInfo;
        this.disclaimer = str13;
        this.tagLabel = tagLabel;
        this.inStoreAvailabilityInfo = inStoreAvailabilityInfo;
        this.productVarieties = productVarieties;
        this.categories = list3;
        this.isTobacco = z3;
        this.multiBuyPriceInfo = multiBuyPriceInfo;
        this.memberPriceInfo = memberPriceInfo;
        this.cartProductInfo = cartProductInfo;
        this.inStoreLocation = inStoreLocationData;
        this.productCardAnalytics = analyticsData;
        this.impressionAnalyticsData = analyticsData2;
        this.productCardAction = actionData;
        this.pricingFootnoteMd = str14;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String title = ((ProductTrolleyData) it.next()).getTitle();
                if (title != null) {
                    arrayList.add(title);
                }
            }
        } else {
            arrayList = null;
        }
        this.trolleySelectorTitleList = arrayList;
    }

    @Deprecated
    public static /* synthetic */ void getPromotionType$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getPromotionValue$annotations() {
    }

    public static /* synthetic */ void getTrolleySelectorTitleList$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void isNew$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getWasPrice() {
        return this.wasPrice;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getMultiBuyPrice() {
        return this.multiBuyPrice;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getMultiBuyUnitPrice() {
        return this.multiBuyUnitPrice;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getPurchaseWarning() {
        return this.purchaseWarning;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final ProductTrolleyData getTrolley() {
        return this.trolley;
    }

    @Nullable
    public final List<ProductTrolleyData> component17() {
        return this.trolleys;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final ProductShoppingList getProductShoppingList() {
        return this.productShoppingList;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final InstoreDetailsData getInStoreDetails() {
        return this.inStoreDetails;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final PurchaseRestriction getPurchaseRestriction() {
        return this.purchaseRestriction;
    }

    @Nullable
    public final List<ProductInlineLabelApiData> component21() {
        return this.inlineLabels;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final PromotionInfo getPromotionInfo() {
        return this.promotionInfo;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final ProductListMarketplace getMarketplace() {
        return this.marketplace;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final RewardsOfferInfo getRewardsOfferInfo() {
        return this.rewardsOfferInfo;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final TagLabel getTagLabel() {
        return this.tagLabel;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final InStoreAvailabilityInfo getInStoreAvailabilityInfo() {
        return this.inStoreAvailabilityInfo;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getProductImage() {
        return this.productImage;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final ProductVarieties getProductVarieties() {
        return this.productVarieties;
    }

    @Nullable
    public final List<ProductCategory> component31() {
        return this.categories;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsTobacco() {
        return this.isTobacco;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final MultiBuyPriceInfo getMultiBuyPriceInfo() {
        return this.multiBuyPriceInfo;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final MemberPriceInfo getMemberPriceInfo() {
        return this.memberPriceInfo;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final CartProductInfo getCartProductInfo() {
        return this.cartProductInfo;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final InStoreLocationData getInStoreLocation() {
        return this.inStoreLocation;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final AnalyticsData getProductCardAnalytics() {
        return this.productCardAnalytics;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final AnalyticsData getImpressionAnalyticsData() {
        return this.impressionAnalyticsData;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final ActionData getProductCardAction() {
        return this.productCardAction;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getBadgeImage() {
        return this.badgeImage;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final String getPricingFootnoteMd() {
        return this.pricingFootnoteMd;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getUnitOfMeasureLabel() {
        return this.unitOfMeasureLabel;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getPromotionValue() {
        return this.promotionValue;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getPromotionType() {
        return this.promotionType;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getUnitPriceDescription() {
        return this.unitPriceDescription;
    }

    @NotNull
    public final ProductCard copy(@NotNull String productId, @NotNull String name, @Nullable String productImage, @Nullable String badgeImage, @Nullable Integer price, @Nullable String unitOfMeasureLabel, @Nullable String promotionValue, @Nullable String promotionType, @Nullable String unitPriceDescription, boolean isAvailable, boolean isNew, @Nullable String wasPrice, @Nullable String multiBuyPrice, @Nullable String multiBuyUnitPrice, @Nullable String purchaseWarning, @Nullable ProductTrolleyData trolley, @Nullable List<ProductTrolleyData> trolleys, @NotNull ProductShoppingList productShoppingList, @Nullable InstoreDetailsData inStoreDetails, @Nullable PurchaseRestriction purchaseRestriction, @Nullable List<ProductInlineLabelApiData> inlineLabels, @Nullable PromotionInfo promotionInfo, @Nullable String adId, @Nullable String source, @Nullable ProductListMarketplace marketplace, @Nullable RewardsOfferInfo rewardsOfferInfo, @Nullable String disclaimer, @Nullable TagLabel tagLabel, @Nullable InStoreAvailabilityInfo inStoreAvailabilityInfo, @Nullable ProductVarieties productVarieties, @Nullable List<ProductCategory> categories, boolean isTobacco, @Nullable MultiBuyPriceInfo multiBuyPriceInfo, @Nullable MemberPriceInfo memberPriceInfo, @Nullable CartProductInfo cartProductInfo, @Nullable InStoreLocationData inStoreLocation, @Nullable AnalyticsData productCardAnalytics, @Nullable AnalyticsData impressionAnalyticsData, @Nullable ActionData productCardAction, @Nullable String pricingFootnoteMd) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(name, "name");
        Intrinsics.h(productShoppingList, "productShoppingList");
        return new ProductCard(productId, name, productImage, badgeImage, price, unitOfMeasureLabel, promotionValue, promotionType, unitPriceDescription, isAvailable, isNew, wasPrice, multiBuyPrice, multiBuyUnitPrice, purchaseWarning, trolley, trolleys, productShoppingList, inStoreDetails, purchaseRestriction, inlineLabels, promotionInfo, adId, source, marketplace, rewardsOfferInfo, disclaimer, tagLabel, inStoreAvailabilityInfo, productVarieties, categories, isTobacco, multiBuyPriceInfo, memberPriceInfo, cartProductInfo, inStoreLocation, productCardAnalytics, impressionAnalyticsData, productCardAction, pricingFootnoteMd);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCard)) {
            return false;
        }
        ProductCard productCard = (ProductCard) other;
        return Intrinsics.c(this.productId, productCard.productId) && Intrinsics.c(this.name, productCard.name) && Intrinsics.c(this.productImage, productCard.productImage) && Intrinsics.c(this.badgeImage, productCard.badgeImage) && Intrinsics.c(this.price, productCard.price) && Intrinsics.c(this.unitOfMeasureLabel, productCard.unitOfMeasureLabel) && Intrinsics.c(this.promotionValue, productCard.promotionValue) && Intrinsics.c(this.promotionType, productCard.promotionType) && Intrinsics.c(this.unitPriceDescription, productCard.unitPriceDescription) && this.isAvailable == productCard.isAvailable && this.isNew == productCard.isNew && Intrinsics.c(this.wasPrice, productCard.wasPrice) && Intrinsics.c(this.multiBuyPrice, productCard.multiBuyPrice) && Intrinsics.c(this.multiBuyUnitPrice, productCard.multiBuyUnitPrice) && Intrinsics.c(this.purchaseWarning, productCard.purchaseWarning) && Intrinsics.c(this.trolley, productCard.trolley) && Intrinsics.c(this.trolleys, productCard.trolleys) && Intrinsics.c(this.productShoppingList, productCard.productShoppingList) && Intrinsics.c(this.inStoreDetails, productCard.inStoreDetails) && this.purchaseRestriction == productCard.purchaseRestriction && Intrinsics.c(this.inlineLabels, productCard.inlineLabels) && Intrinsics.c(this.promotionInfo, productCard.promotionInfo) && Intrinsics.c(this.adId, productCard.adId) && Intrinsics.c(this.source, productCard.source) && Intrinsics.c(this.marketplace, productCard.marketplace) && Intrinsics.c(this.rewardsOfferInfo, productCard.rewardsOfferInfo) && Intrinsics.c(this.disclaimer, productCard.disclaimer) && Intrinsics.c(this.tagLabel, productCard.tagLabel) && Intrinsics.c(this.inStoreAvailabilityInfo, productCard.inStoreAvailabilityInfo) && Intrinsics.c(this.productVarieties, productCard.productVarieties) && Intrinsics.c(this.categories, productCard.categories) && this.isTobacco == productCard.isTobacco && Intrinsics.c(this.multiBuyPriceInfo, productCard.multiBuyPriceInfo) && Intrinsics.c(this.memberPriceInfo, productCard.memberPriceInfo) && Intrinsics.c(this.cartProductInfo, productCard.cartProductInfo) && Intrinsics.c(this.inStoreLocation, productCard.inStoreLocation) && Intrinsics.c(this.productCardAnalytics, productCard.productCardAnalytics) && Intrinsics.c(this.impressionAnalyticsData, productCard.impressionAnalyticsData) && Intrinsics.c(this.productCardAction, productCard.productCardAction) && Intrinsics.c(this.pricingFootnoteMd, productCard.pricingFootnoteMd);
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final String getBadgeImage() {
        return this.badgeImage;
    }

    @Nullable
    public final CartProductInfo getCartProductInfo() {
        return this.cartProductInfo;
    }

    @Nullable
    public final List<ProductCategory> getCategories() {
        return this.categories;
    }

    @Nullable
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    @Nullable
    public AnalyticsData getImpressionAnalyticsData() {
        return this.impressionAnalyticsData;
    }

    @Nullable
    public final InStoreAvailabilityInfo getInStoreAvailabilityInfo() {
        return this.inStoreAvailabilityInfo;
    }

    @Nullable
    public final InstoreDetailsData getInStoreDetails() {
        return this.inStoreDetails;
    }

    @Nullable
    public final InStoreLocationData getInStoreLocation() {
        return this.inStoreLocation;
    }

    @Nullable
    public final List<ProductInlineLabelApiData> getInlineLabels() {
        return this.inlineLabels;
    }

    @Nullable
    public final ProductListMarketplace getMarketplace() {
        return this.marketplace;
    }

    @Nullable
    public final MemberPriceInfo getMemberPriceInfo() {
        return this.memberPriceInfo;
    }

    @Nullable
    public final String getMultiBuyPrice() {
        return this.multiBuyPrice;
    }

    @Nullable
    public final MultiBuyPriceInfo getMultiBuyPriceInfo() {
        return this.multiBuyPriceInfo;
    }

    @Nullable
    public final String getMultiBuyUnitPrice() {
        return this.multiBuyUnitPrice;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPricingFootnoteMd() {
        return this.pricingFootnoteMd;
    }

    @Nullable
    public final ActionData getProductCardAction() {
        return this.productCardAction;
    }

    @Nullable
    public final AnalyticsData getProductCardAnalytics() {
        return this.productCardAnalytics;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductImage() {
        return this.productImage;
    }

    @NotNull
    public final ProductShoppingList getProductShoppingList() {
        return this.productShoppingList;
    }

    @Nullable
    public final ProductVarieties getProductVarieties() {
        return this.productVarieties;
    }

    @Nullable
    public final PromotionInfo getPromotionInfo() {
        return this.promotionInfo;
    }

    @Nullable
    public final String getPromotionType() {
        return this.promotionType;
    }

    @Nullable
    public final String getPromotionValue() {
        return this.promotionValue;
    }

    @Nullable
    public final PurchaseRestriction getPurchaseRestriction() {
        return this.purchaseRestriction;
    }

    @Nullable
    public final String getPurchaseWarning() {
        return this.purchaseWarning;
    }

    @Nullable
    public final RewardsOfferInfo getRewardsOfferInfo() {
        return this.rewardsOfferInfo;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final TagLabel getTagLabel() {
        return this.tagLabel;
    }

    @Nullable
    public final ProductTrolleyData getTrolley() {
        return this.trolley;
    }

    @Nullable
    public final List<String> getTrolleySelectorTitleList() {
        return this.trolleySelectorTitleList;
    }

    @Nullable
    public final List<ProductTrolleyData> getTrolleys() {
        return this.trolleys;
    }

    @Nullable
    public final String getUnitOfMeasureLabel() {
        return this.unitOfMeasureLabel;
    }

    @Nullable
    public final String getUnitPriceDescription() {
        return this.unitPriceDescription;
    }

    @Nullable
    public final String getWasPrice() {
        return this.wasPrice;
    }

    public int hashCode() {
        int iC = b.c(this.productId.hashCode() * 31, 31, this.name);
        String str = this.productImage;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badgeImage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.price;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.unitOfMeasureLabel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promotionValue;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.promotionType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.unitPriceDescription;
        int iE = b.e(b.e((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.isAvailable), 31, this.isNew);
        String str7 = this.wasPrice;
        int iHashCode7 = (iE + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.multiBuyPrice;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.multiBuyUnitPrice;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.purchaseWarning;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        ProductTrolleyData productTrolleyData = this.trolley;
        int iHashCode11 = (iHashCode10 + (productTrolleyData == null ? 0 : productTrolleyData.hashCode())) * 31;
        List<ProductTrolleyData> list = this.trolleys;
        int iHashCode12 = (this.productShoppingList.hashCode() + ((iHashCode11 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        InstoreDetailsData instoreDetailsData = this.inStoreDetails;
        int iHashCode13 = (iHashCode12 + (instoreDetailsData == null ? 0 : instoreDetailsData.hashCode())) * 31;
        PurchaseRestriction purchaseRestriction = this.purchaseRestriction;
        int iHashCode14 = (iHashCode13 + (purchaseRestriction == null ? 0 : purchaseRestriction.hashCode())) * 31;
        List<ProductInlineLabelApiData> list2 = this.inlineLabels;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PromotionInfo promotionInfo = this.promotionInfo;
        int iHashCode16 = (iHashCode15 + (promotionInfo == null ? 0 : promotionInfo.hashCode())) * 31;
        String str11 = this.adId;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.source;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        ProductListMarketplace productListMarketplace = this.marketplace;
        int iHashCode19 = (iHashCode18 + (productListMarketplace == null ? 0 : productListMarketplace.hashCode())) * 31;
        RewardsOfferInfo rewardsOfferInfo = this.rewardsOfferInfo;
        int iHashCode20 = (iHashCode19 + (rewardsOfferInfo == null ? 0 : rewardsOfferInfo.hashCode())) * 31;
        String str13 = this.disclaimer;
        int iHashCode21 = (iHashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        TagLabel tagLabel = this.tagLabel;
        int iHashCode22 = (iHashCode21 + (tagLabel == null ? 0 : tagLabel.hashCode())) * 31;
        InStoreAvailabilityInfo inStoreAvailabilityInfo = this.inStoreAvailabilityInfo;
        int iHashCode23 = (iHashCode22 + (inStoreAvailabilityInfo == null ? 0 : inStoreAvailabilityInfo.hashCode())) * 31;
        ProductVarieties productVarieties = this.productVarieties;
        int iHashCode24 = (iHashCode23 + (productVarieties == null ? 0 : productVarieties.hashCode())) * 31;
        List<ProductCategory> list3 = this.categories;
        int iE2 = b.e((iHashCode24 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.isTobacco);
        MultiBuyPriceInfo multiBuyPriceInfo = this.multiBuyPriceInfo;
        int iHashCode25 = (iE2 + (multiBuyPriceInfo == null ? 0 : multiBuyPriceInfo.hashCode())) * 31;
        MemberPriceInfo memberPriceInfo = this.memberPriceInfo;
        int iHashCode26 = (iHashCode25 + (memberPriceInfo == null ? 0 : memberPriceInfo.hashCode())) * 31;
        CartProductInfo cartProductInfo = this.cartProductInfo;
        int iHashCode27 = (iHashCode26 + (cartProductInfo == null ? 0 : cartProductInfo.hashCode())) * 31;
        InStoreLocationData inStoreLocationData = this.inStoreLocation;
        int iHashCode28 = (iHashCode27 + (inStoreLocationData == null ? 0 : inStoreLocationData.hashCode())) * 31;
        AnalyticsData analyticsData = this.productCardAnalytics;
        int iHashCode29 = (iHashCode28 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.impressionAnalyticsData;
        int iHashCode30 = (iHashCode29 + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31;
        ActionData actionData = this.productCardAction;
        int iHashCode31 = (iHashCode30 + (actionData == null ? 0 : actionData.hashCode())) * 31;
        String str14 = this.pricingFootnoteMd;
        return iHashCode31 + (str14 != null ? str14.hashCode() : 0);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final boolean isTobacco() {
        return this.isTobacco;
    }

    public void setImpressionAnalyticsData(@Nullable AnalyticsData analyticsData) {
        this.impressionAnalyticsData = analyticsData;
    }

    @NotNull
    public String toString() {
        String str = this.productId;
        String str2 = this.name;
        String str3 = this.productImage;
        String str4 = this.badgeImage;
        Integer num = this.price;
        String str5 = this.unitOfMeasureLabel;
        String str6 = this.promotionValue;
        String str7 = this.promotionType;
        String str8 = this.unitPriceDescription;
        boolean z = this.isAvailable;
        boolean z2 = this.isNew;
        String str9 = this.wasPrice;
        String str10 = this.multiBuyPrice;
        String str11 = this.multiBuyUnitPrice;
        String str12 = this.purchaseWarning;
        ProductTrolleyData productTrolleyData = this.trolley;
        List<ProductTrolleyData> list = this.trolleys;
        ProductShoppingList productShoppingList = this.productShoppingList;
        InstoreDetailsData instoreDetailsData = this.inStoreDetails;
        PurchaseRestriction purchaseRestriction = this.purchaseRestriction;
        List<ProductInlineLabelApiData> list2 = this.inlineLabels;
        PromotionInfo promotionInfo = this.promotionInfo;
        String str13 = this.adId;
        String str14 = this.source;
        ProductListMarketplace productListMarketplace = this.marketplace;
        RewardsOfferInfo rewardsOfferInfo = this.rewardsOfferInfo;
        String str15 = this.disclaimer;
        TagLabel tagLabel = this.tagLabel;
        InStoreAvailabilityInfo inStoreAvailabilityInfo = this.inStoreAvailabilityInfo;
        ProductVarieties productVarieties = this.productVarieties;
        List<ProductCategory> list3 = this.categories;
        boolean z3 = this.isTobacco;
        MultiBuyPriceInfo multiBuyPriceInfo = this.multiBuyPriceInfo;
        MemberPriceInfo memberPriceInfo = this.memberPriceInfo;
        CartProductInfo cartProductInfo = this.cartProductInfo;
        InStoreLocationData inStoreLocationData = this.inStoreLocation;
        AnalyticsData analyticsData = this.productCardAnalytics;
        AnalyticsData analyticsData2 = this.impressionAnalyticsData;
        ActionData actionData = this.productCardAction;
        String str16 = this.pricingFootnoteMd;
        StringBuilder sbV = YU.a.v("ProductCard(productId=", str, ", name=", str2, ", productImage=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", badgeImage=", str4, ", price=");
        sbV.append(num);
        sbV.append(", unitOfMeasureLabel=");
        sbV.append(str5);
        sbV.append(", promotionValue=");
        androidx.constraintlayout.core.state.a.B(sbV, str6, ", promotionType=", str7, ", unitPriceDescription=");
        d.A(str8, ", isAvailable=", ", isNew=", sbV, z);
        au.com.woolworths.android.onesite.a.y(", wasPrice=", str9, ", multiBuyPrice=", sbV, z2);
        androidx.constraintlayout.core.state.a.B(sbV, str10, ", multiBuyUnitPrice=", str11, ", purchaseWarning=");
        sbV.append(str12);
        sbV.append(", trolley=");
        sbV.append(productTrolleyData);
        sbV.append(", trolleys=");
        sbV.append(list);
        sbV.append(", productShoppingList=");
        sbV.append(productShoppingList);
        sbV.append(", inStoreDetails=");
        sbV.append(instoreDetailsData);
        sbV.append(", purchaseRestriction=");
        sbV.append(purchaseRestriction);
        sbV.append(", inlineLabels=");
        sbV.append(list2);
        sbV.append(", promotionInfo=");
        sbV.append(promotionInfo);
        sbV.append(", adId=");
        androidx.constraintlayout.core.state.a.B(sbV, str13, ", source=", str14, ", marketplace=");
        sbV.append(productListMarketplace);
        sbV.append(", rewardsOfferInfo=");
        sbV.append(rewardsOfferInfo);
        sbV.append(", disclaimer=");
        sbV.append(str15);
        sbV.append(", tagLabel=");
        sbV.append(tagLabel);
        sbV.append(", inStoreAvailabilityInfo=");
        sbV.append(inStoreAvailabilityInfo);
        sbV.append(", productVarieties=");
        sbV.append(productVarieties);
        sbV.append(", categories=");
        sbV.append(list3);
        sbV.append(", isTobacco=");
        sbV.append(z3);
        sbV.append(", multiBuyPriceInfo=");
        sbV.append(multiBuyPriceInfo);
        sbV.append(", memberPriceInfo=");
        sbV.append(memberPriceInfo);
        sbV.append(", cartProductInfo=");
        sbV.append(cartProductInfo);
        sbV.append(", inStoreLocation=");
        sbV.append(inStoreLocationData);
        sbV.append(", productCardAnalytics=");
        sbV.append(analyticsData);
        sbV.append(", impressionAnalyticsData=");
        sbV.append(analyticsData2);
        sbV.append(", productCardAction=");
        sbV.append(actionData);
        sbV.append(", pricingFootnoteMd=");
        sbV.append(str16);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.productId);
        dest.writeString(this.name);
        dest.writeString(this.productImage);
        dest.writeString(this.badgeImage);
        Integer num = this.price;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.unitOfMeasureLabel);
        dest.writeString(this.promotionValue);
        dest.writeString(this.promotionType);
        dest.writeString(this.unitPriceDescription);
        dest.writeInt(this.isAvailable ? 1 : 0);
        dest.writeInt(this.isNew ? 1 : 0);
        dest.writeString(this.wasPrice);
        dest.writeString(this.multiBuyPrice);
        dest.writeString(this.multiBuyUnitPrice);
        dest.writeString(this.purchaseWarning);
        ProductTrolleyData productTrolleyData = this.trolley;
        if (productTrolleyData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productTrolleyData.writeToParcel(dest, flags);
        }
        List<ProductTrolleyData> list = this.trolleys;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ProductTrolleyData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        this.productShoppingList.writeToParcel(dest, flags);
        InstoreDetailsData instoreDetailsData = this.inStoreDetails;
        if (instoreDetailsData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            instoreDetailsData.writeToParcel(dest, flags);
        }
        PurchaseRestriction purchaseRestriction = this.purchaseRestriction;
        if (purchaseRestriction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            purchaseRestriction.writeToParcel(dest, flags);
        }
        List<ProductInlineLabelApiData> list2 = this.inlineLabels;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<ProductInlineLabelApiData> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        dest.writeParcelable(this.promotionInfo, flags);
        dest.writeString(this.adId);
        dest.writeString(this.source);
        dest.writeParcelable(this.marketplace, flags);
        RewardsOfferInfo rewardsOfferInfo = this.rewardsOfferInfo;
        if (rewardsOfferInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsOfferInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.disclaimer);
        TagLabel tagLabel = this.tagLabel;
        if (tagLabel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tagLabel.writeToParcel(dest, flags);
        }
        InStoreAvailabilityInfo inStoreAvailabilityInfo = this.inStoreAvailabilityInfo;
        if (inStoreAvailabilityInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inStoreAvailabilityInfo.writeToParcel(dest, flags);
        }
        ProductVarieties productVarieties = this.productVarieties;
        if (productVarieties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productVarieties.writeToParcel(dest, flags);
        }
        List<ProductCategory> list3 = this.categories;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            Iterator<ProductCategory> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.isTobacco ? 1 : 0);
        MultiBuyPriceInfo multiBuyPriceInfo = this.multiBuyPriceInfo;
        if (multiBuyPriceInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            multiBuyPriceInfo.writeToParcel(dest, flags);
        }
        MemberPriceInfo memberPriceInfo = this.memberPriceInfo;
        if (memberPriceInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            memberPriceInfo.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.cartProductInfo, flags);
        InStoreLocationData inStoreLocationData = this.inStoreLocation;
        if (inStoreLocationData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inStoreLocationData.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.productCardAnalytics, flags);
        dest.writeParcelable(this.impressionAnalyticsData, flags);
        dest.writeParcelable(this.productCardAction, flags);
        dest.writeString(this.pricingFootnoteMd);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductCard(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, ProductTrolleyData productTrolleyData, List list, ProductShoppingList productShoppingList, InstoreDetailsData instoreDetailsData, PurchaseRestriction purchaseRestriction, List list2, PromotionInfo promotionInfo, String str13, String str14, ProductListMarketplace productListMarketplace, RewardsOfferInfo rewardsOfferInfo, String str15, TagLabel tagLabel, InStoreAvailabilityInfo inStoreAvailabilityInfo, ProductVarieties productVarieties, List list3, boolean z3, MultiBuyPriceInfo multiBuyPriceInfo, MemberPriceInfo memberPriceInfo, CartProductInfo cartProductInfo, InStoreLocationData inStoreLocationData, AnalyticsData analyticsData, AnalyticsData analyticsData2, ActionData actionData, String str16, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str17 = (i & 4) != 0 ? null : str3;
        String str18 = (i & 8) != 0 ? null : str4;
        Integer num2 = (i & 16) != 0 ? null : num;
        String str19 = (i & 32) != 0 ? null : str5;
        String str20 = (i & 64) != 0 ? null : str6;
        String str21 = (i & 128) != 0 ? null : str7;
        String str22 = (i & 256) != 0 ? null : str8;
        String str23 = (i & 2048) != 0 ? null : str9;
        String str24 = (i & 4096) != 0 ? null : str10;
        String str25 = (i & 8192) != 0 ? null : str11;
        String str26 = (i & 16384) != 0 ? null : str12;
        ProductTrolleyData productTrolleyData2 = (32768 & i) != 0 ? null : productTrolleyData;
        List list4 = (65536 & i) != 0 ? null : list;
        InstoreDetailsData instoreDetailsData2 = (262144 & i) != 0 ? null : instoreDetailsData;
        PurchaseRestriction purchaseRestriction2 = (524288 & i) != 0 ? null : purchaseRestriction;
        List list5 = (1048576 & i) != 0 ? null : list2;
        PromotionInfo promotionInfo2 = (2097152 & i) != 0 ? null : promotionInfo;
        String str27 = (4194304 & i) != 0 ? null : str13;
        String str28 = (8388608 & i) != 0 ? null : str14;
        ProductListMarketplace productListMarketplace2 = (16777216 & i) != 0 ? null : productListMarketplace;
        RewardsOfferInfo rewardsOfferInfo2 = (33554432 & i) != 0 ? null : rewardsOfferInfo;
        String str29 = (67108864 & i) != 0 ? null : str15;
        TagLabel tagLabel2 = (134217728 & i) != 0 ? null : tagLabel;
        InStoreAvailabilityInfo inStoreAvailabilityInfo2 = (268435456 & i) != 0 ? null : inStoreAvailabilityInfo;
        ProductVarieties productVarieties2 = (536870912 & i) != 0 ? null : productVarieties;
        List list6 = (1073741824 & i) != 0 ? null : list3;
        boolean z4 = (i & Integer.MIN_VALUE) != 0 ? false : z3;
        MultiBuyPriceInfo multiBuyPriceInfo2 = (i2 & 1) != 0 ? null : multiBuyPriceInfo;
        MemberPriceInfo memberPriceInfo2 = (i2 & 2) != 0 ? null : memberPriceInfo;
        CartProductInfo cartProductInfo2 = (i2 & 4) != 0 ? null : cartProductInfo;
        InStoreLocationData inStoreLocationData2 = (i2 & 8) != 0 ? null : inStoreLocationData;
        AnalyticsData analyticsData3 = (i2 & 16) != 0 ? null : analyticsData;
        this(str, str2, str17, str18, num2, str19, str20, str21, str22, z, z2, str23, str24, str25, str26, productTrolleyData2, list4, productShoppingList, instoreDetailsData2, purchaseRestriction2, list5, promotionInfo2, str27, str28, productListMarketplace2, rewardsOfferInfo2, str29, tagLabel2, inStoreAvailabilityInfo2, productVarieties2, list6, z4, multiBuyPriceInfo2, memberPriceInfo2, cartProductInfo2, inStoreLocationData2, analyticsData3, (i2 & 32) != 0 ? analyticsData3 : analyticsData2, (i2 & 64) != 0 ? null : actionData, (i2 & 128) != 0 ? null : str16);
    }
}
