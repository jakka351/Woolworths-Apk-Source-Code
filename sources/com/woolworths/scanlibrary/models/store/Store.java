package com.woolworths.scanlibrary.models.store;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.storage.db.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\\\b\u0087\b\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0087\u0001\u0088\u0001BÁ\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u0000\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010)\u001a\u00020 \u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010,\u001a\u00020-¢\u0006\u0004\b.\u0010/J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\btJ\u000f\u0010u\u001a\b\u0018\u00010\u001dR\u00020\u0000HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010w\u001a\u00020 HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010|\u001a\u00020&HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020 HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020-HÆ\u0003JÆ\u0003\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010)\u001a\u00020 2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010,\u001a\u00020-HÆ\u0001J\u0015\u0010\u0083\u0001\u001a\u00020-2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0085\u0001\u001a\u00020 HÖ\u0001J\n\u0010\u0086\u0001\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00101R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00101R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u001c\u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u00008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0016\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00101R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00101R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00101R\u0016\u0010%\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00101R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00101R\u0016\u0010)\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010NR\u0018\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0016\u0010,\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[¨\u0006\u0089\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/models/store/Store;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "addressLine1", "addressLine2", "country", "division", Scopes.EMAIL, "extra1", "extra2", "extra3", "extra4", "extra5", "extra6", "extra7", "extra8", "extra9", "extra10", "extra11", "extra12", "extra13", "extra14", "extra15", "facilities", "", "geoLevel", "gMTZone", "images", "Lcom/woolworths/scanlibrary/models/store/Store$Images;", "manager", "no", "", "phone", "postcode", "state", "suburb", "distance", "", h.a.b, "longtitude", "tillid", "storeTradingWeek", "Lcom/woolworths/scanlibrary/models/store/StoreTradingWeek;", "notify_wifi", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/store/Store$Images;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;ILcom/woolworths/scanlibrary/models/store/StoreTradingWeek;Z)V", "getName", "()Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getCountry", "getDivision", "getEmail", "getExtra1", "getExtra2", "getExtra3", "getExtra4", "getExtra5", "getExtra6", "getExtra7", "getExtra8", "getExtra9", "getExtra10", "getExtra11", "getExtra12", "getExtra13", "getExtra14", "getExtra15", "getFacilities", "()Ljava/util/List;", "getGeoLevel", "getGMTZone$scanGoLibrary_release", "getImages", "()Lcom/woolworths/scanlibrary/models/store/Store$Images;", "getManager", "getNo", "()I", "getPhone", "getPostcode", "getState", "getSuburb", "getDistance", "()F", "getLatitude", "getLongtitude", "getTillid", "getStoreTradingWeek", "()Lcom/woolworths/scanlibrary/models/store/StoreTradingWeek;", "getNotify_wifi", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component24$scanGoLibrary_release", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "copy", "equals", "other", "hashCode", "toString", "Images", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Store {

    @NotNull
    public static final String TIME_FORMAT = "Open %s \t -\t\t Closes %s";

    @NotNull
    public static final String TIME_FORMAT_REFRESH = "Open %s - Closes %s";

    @SerializedName("addressLine1")
    @Nullable
    private final String addressLine1;

    @SerializedName("addressLine2")
    @Nullable
    private final String addressLine2;

    @SerializedName("country")
    @Nullable
    private final String country;

    @SerializedName("distance")
    private final float distance;

    @SerializedName("division")
    @Nullable
    private final String division;

    @SerializedName(Scopes.EMAIL)
    @Nullable
    private final String email;

    @SerializedName("extra1")
    @Nullable
    private final String extra1;

    @SerializedName("extra10")
    @Nullable
    private final String extra10;

    @SerializedName("extra11")
    @Nullable
    private final String extra11;

    @SerializedName("extra12")
    @Nullable
    private final String extra12;

    @SerializedName("extra13")
    @Nullable
    private final String extra13;

    @SerializedName("extra14")
    @Nullable
    private final String extra14;

    @SerializedName("extra15")
    @Nullable
    private final String extra15;

    @SerializedName("extra2")
    @Nullable
    private final String extra2;

    @SerializedName("extra3")
    @Nullable
    private final String extra3;

    @SerializedName("extra4")
    @Nullable
    private final String extra4;

    @SerializedName("extra5")
    @Nullable
    private final String extra5;

    @SerializedName("extra6")
    @Nullable
    private final String extra6;

    @SerializedName("extra7")
    @Nullable
    private final String extra7;

    @SerializedName("extra8")
    @Nullable
    private final String extra8;

    @SerializedName("extra9")
    @Nullable
    private final String extra9;

    @SerializedName("facilities")
    @Nullable
    private final List<String> facilities;

    @SerializedName("gMTZone")
    @Nullable
    private final String gMTZone;

    @SerializedName("geoLevel")
    @Nullable
    private final String geoLevel;

    @SerializedName("images")
    @Nullable
    private final Images images;

    @SerializedName(h.a.b)
    @Nullable
    private final String latitude;

    @SerializedName("longtitude")
    @Nullable
    private final String longtitude;

    @SerializedName("manager")
    @Nullable
    private final String manager;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("no")
    private final int no;

    @SerializedName("notify_wifi")
    private final boolean notify_wifi;

    @SerializedName("phone")
    @Nullable
    private final String phone;

    @SerializedName("postcode")
    @Nullable
    private final String postcode;

    @SerializedName("state")
    @Nullable
    private final String state;

    @SerializedName("trading_hours")
    @Nullable
    private final StoreTradingWeek storeTradingWeek;

    @SerializedName("suburb")
    @Nullable
    private final String suburb;

    @SerializedName("tillid")
    private final int tillid;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/models/store/Store$Images;", "", "<init>", "(Lcom/woolworths/scanlibrary/models/store/Store;)V", "small", "", "large", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Images {

        @SerializedName("large")
        @Nullable
        private final String large;

        @SerializedName("small")
        @Nullable
        private final String small;

        public Images() {
        }
    }

    public Store(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable List<String> list, @Nullable String str21, @Nullable String str22, @Nullable Images images, @Nullable String str23, int i, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, float f, @Nullable String str28, @Nullable String str29, int i2, @Nullable StoreTradingWeek storeTradingWeek, boolean z) {
        Intrinsics.h(name, "name");
        this.name = name;
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.country = str3;
        this.division = str4;
        this.email = str5;
        this.extra1 = str6;
        this.extra2 = str7;
        this.extra3 = str8;
        this.extra4 = str9;
        this.extra5 = str10;
        this.extra6 = str11;
        this.extra7 = str12;
        this.extra8 = str13;
        this.extra9 = str14;
        this.extra10 = str15;
        this.extra11 = str16;
        this.extra12 = str17;
        this.extra13 = str18;
        this.extra14 = str19;
        this.extra15 = str20;
        this.facilities = list;
        this.geoLevel = str21;
        this.gMTZone = str22;
        this.images = images;
        this.manager = str23;
        this.no = i;
        this.phone = str24;
        this.postcode = str25;
        this.state = str26;
        this.suburb = str27;
        this.distance = f;
        this.latitude = str28;
        this.longtitude = str29;
        this.tillid = i2;
        this.storeTradingWeek = storeTradingWeek;
        this.notify_wifi = z;
    }

    public static /* synthetic */ Store copy$default(Store store, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List list, String str22, String str23, Images images, String str24, int i, String str25, String str26, String str27, String str28, float f, String str29, String str30, int i2, StoreTradingWeek storeTradingWeek, boolean z, int i3, int i4, Object obj) {
        boolean z2;
        StoreTradingWeek storeTradingWeek2;
        String str31;
        List list2;
        String str32;
        String str33;
        Images images2;
        String str34;
        int i5;
        String str35;
        String str36;
        String str37;
        String str38;
        float f2;
        String str39;
        String str40;
        int i6;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60 = (i3 & 1) != 0 ? store.name : str;
        String str61 = (i3 & 2) != 0 ? store.addressLine1 : str2;
        String str62 = (i3 & 4) != 0 ? store.addressLine2 : str3;
        String str63 = (i3 & 8) != 0 ? store.country : str4;
        String str64 = (i3 & 16) != 0 ? store.division : str5;
        String str65 = (i3 & 32) != 0 ? store.email : str6;
        String str66 = (i3 & 64) != 0 ? store.extra1 : str7;
        String str67 = (i3 & 128) != 0 ? store.extra2 : str8;
        String str68 = (i3 & 256) != 0 ? store.extra3 : str9;
        String str69 = (i3 & 512) != 0 ? store.extra4 : str10;
        String str70 = (i3 & 1024) != 0 ? store.extra5 : str11;
        String str71 = (i3 & 2048) != 0 ? store.extra6 : str12;
        String str72 = (i3 & 4096) != 0 ? store.extra7 : str13;
        String str73 = (i3 & 8192) != 0 ? store.extra8 : str14;
        String str74 = str60;
        String str75 = (i3 & 16384) != 0 ? store.extra9 : str15;
        String str76 = (i3 & 32768) != 0 ? store.extra10 : str16;
        String str77 = (i3 & 65536) != 0 ? store.extra11 : str17;
        String str78 = (i3 & 131072) != 0 ? store.extra12 : str18;
        String str79 = (i3 & 262144) != 0 ? store.extra13 : str19;
        String str80 = (i3 & 524288) != 0 ? store.extra14 : str20;
        String str81 = (i3 & 1048576) != 0 ? store.extra15 : str21;
        List list3 = (i3 & 2097152) != 0 ? store.facilities : list;
        String str82 = (i3 & 4194304) != 0 ? store.geoLevel : str22;
        String str83 = (i3 & 8388608) != 0 ? store.gMTZone : str23;
        Images images3 = (i3 & 16777216) != 0 ? store.images : images;
        String str84 = (i3 & 33554432) != 0 ? store.manager : str24;
        int i7 = (i3 & 67108864) != 0 ? store.no : i;
        String str85 = (i3 & 134217728) != 0 ? store.phone : str25;
        String str86 = (i3 & 268435456) != 0 ? store.postcode : str26;
        String str87 = (i3 & 536870912) != 0 ? store.state : str27;
        String str88 = (i3 & 1073741824) != 0 ? store.suburb : str28;
        float f3 = (i3 & Integer.MIN_VALUE) != 0 ? store.distance : f;
        String str89 = (i4 & 1) != 0 ? store.latitude : str29;
        String str90 = (i4 & 2) != 0 ? store.longtitude : str30;
        int i8 = (i4 & 4) != 0 ? store.tillid : i2;
        StoreTradingWeek storeTradingWeek3 = (i4 & 8) != 0 ? store.storeTradingWeek : storeTradingWeek;
        if ((i4 & 16) != 0) {
            storeTradingWeek2 = storeTradingWeek3;
            z2 = store.notify_wifi;
            list2 = list3;
            str32 = str82;
            str33 = str83;
            images2 = images3;
            str34 = str84;
            i5 = i7;
            str35 = str85;
            str36 = str86;
            str37 = str87;
            str38 = str88;
            f2 = f3;
            str39 = str89;
            str40 = str90;
            i6 = i8;
            str41 = str75;
            str43 = str66;
            str44 = str67;
            str45 = str68;
            str46 = str69;
            str47 = str70;
            str48 = str71;
            str49 = str72;
            str50 = str73;
            str51 = str76;
            str52 = str77;
            str53 = str78;
            str54 = str79;
            str55 = str80;
            str31 = str81;
            str56 = str61;
            str57 = str62;
            str58 = str63;
            str59 = str64;
            str42 = str65;
        } else {
            z2 = z;
            storeTradingWeek2 = storeTradingWeek3;
            str31 = str81;
            list2 = list3;
            str32 = str82;
            str33 = str83;
            images2 = images3;
            str34 = str84;
            i5 = i7;
            str35 = str85;
            str36 = str86;
            str37 = str87;
            str38 = str88;
            f2 = f3;
            str39 = str89;
            str40 = str90;
            i6 = i8;
            str41 = str75;
            str42 = str65;
            str43 = str66;
            str44 = str67;
            str45 = str68;
            str46 = str69;
            str47 = str70;
            str48 = str71;
            str49 = str72;
            str50 = str73;
            str51 = str76;
            str52 = str77;
            str53 = str78;
            str54 = str79;
            str55 = str80;
            str56 = str61;
            str57 = str62;
            str58 = str63;
            str59 = str64;
        }
        return store.copy(str74, str56, str57, str58, str59, str42, str43, str44, str45, str46, str47, str48, str49, str50, str41, str51, str52, str53, str54, str55, str31, list2, str32, str33, images2, str34, i5, str35, str36, str37, str38, f2, str39, str40, i6, storeTradingWeek2, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getExtra4() {
        return this.extra4;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getExtra5() {
        return this.extra5;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getExtra6() {
        return this.extra6;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getExtra7() {
        return this.extra7;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getExtra8() {
        return this.extra8;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getExtra9() {
        return this.extra9;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getExtra10() {
        return this.extra10;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getExtra11() {
        return this.extra11;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getExtra12() {
        return this.extra12;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getExtra13() {
        return this.extra13;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getExtra14() {
        return this.extra14;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getExtra15() {
        return this.extra15;
    }

    @Nullable
    public final List<String> component22() {
        return this.facilities;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getGeoLevel() {
        return this.geoLevel;
    }

    @Nullable
    /* renamed from: component24$scanGoLibrary_release, reason: from getter */
    public final String getGMTZone() {
        return this.gMTZone;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Images getImages() {
        return this.images;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final String getManager() {
        return this.manager;
    }

    /* renamed from: component27, reason: from getter */
    public final int getNo() {
        return this.no;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final String getSuburb() {
        return this.suburb;
    }

    /* renamed from: component32, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final String getLongtitude() {
        return this.longtitude;
    }

    /* renamed from: component35, reason: from getter */
    public final int getTillid() {
        return this.tillid;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final StoreTradingWeek getStoreTradingWeek() {
        return this.storeTradingWeek;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getNotify_wifi() {
        return this.notify_wifi;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDivision() {
        return this.division;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getExtra1() {
        return this.extra1;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getExtra2() {
        return this.extra2;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getExtra3() {
        return this.extra3;
    }

    @NotNull
    public final Store copy(@NotNull String name, @Nullable String addressLine1, @Nullable String addressLine2, @Nullable String country, @Nullable String division, @Nullable String email, @Nullable String extra1, @Nullable String extra2, @Nullable String extra3, @Nullable String extra4, @Nullable String extra5, @Nullable String extra6, @Nullable String extra7, @Nullable String extra8, @Nullable String extra9, @Nullable String extra10, @Nullable String extra11, @Nullable String extra12, @Nullable String extra13, @Nullable String extra14, @Nullable String extra15, @Nullable List<String> facilities, @Nullable String geoLevel, @Nullable String gMTZone, @Nullable Images images, @Nullable String manager, int no, @Nullable String phone, @Nullable String postcode, @Nullable String state, @Nullable String suburb, float distance, @Nullable String latitude, @Nullable String longtitude, int tillid, @Nullable StoreTradingWeek storeTradingWeek, boolean notify_wifi) {
        Intrinsics.h(name, "name");
        return new Store(name, addressLine1, addressLine2, country, division, email, extra1, extra2, extra3, extra4, extra5, extra6, extra7, extra8, extra9, extra10, extra11, extra12, extra13, extra14, extra15, facilities, geoLevel, gMTZone, images, manager, no, phone, postcode, state, suburb, distance, latitude, longtitude, tillid, storeTradingWeek, notify_wifi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Store)) {
            return false;
        }
        Store store = (Store) other;
        return Intrinsics.c(this.name, store.name) && Intrinsics.c(this.addressLine1, store.addressLine1) && Intrinsics.c(this.addressLine2, store.addressLine2) && Intrinsics.c(this.country, store.country) && Intrinsics.c(this.division, store.division) && Intrinsics.c(this.email, store.email) && Intrinsics.c(this.extra1, store.extra1) && Intrinsics.c(this.extra2, store.extra2) && Intrinsics.c(this.extra3, store.extra3) && Intrinsics.c(this.extra4, store.extra4) && Intrinsics.c(this.extra5, store.extra5) && Intrinsics.c(this.extra6, store.extra6) && Intrinsics.c(this.extra7, store.extra7) && Intrinsics.c(this.extra8, store.extra8) && Intrinsics.c(this.extra9, store.extra9) && Intrinsics.c(this.extra10, store.extra10) && Intrinsics.c(this.extra11, store.extra11) && Intrinsics.c(this.extra12, store.extra12) && Intrinsics.c(this.extra13, store.extra13) && Intrinsics.c(this.extra14, store.extra14) && Intrinsics.c(this.extra15, store.extra15) && Intrinsics.c(this.facilities, store.facilities) && Intrinsics.c(this.geoLevel, store.geoLevel) && Intrinsics.c(this.gMTZone, store.gMTZone) && Intrinsics.c(this.images, store.images) && Intrinsics.c(this.manager, store.manager) && this.no == store.no && Intrinsics.c(this.phone, store.phone) && Intrinsics.c(this.postcode, store.postcode) && Intrinsics.c(this.state, store.state) && Intrinsics.c(this.suburb, store.suburb) && Float.compare(this.distance, store.distance) == 0 && Intrinsics.c(this.latitude, store.latitude) && Intrinsics.c(this.longtitude, store.longtitude) && this.tillid == store.tillid && Intrinsics.c(this.storeTradingWeek, store.storeTradingWeek) && this.notify_wifi == store.notify_wifi;
    }

    @Nullable
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    @Nullable
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    public final float getDistance() {
        return this.distance;
    }

    @Nullable
    public final String getDivision() {
        return this.division;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getExtra1() {
        return this.extra1;
    }

    @Nullable
    public final String getExtra10() {
        return this.extra10;
    }

    @Nullable
    public final String getExtra11() {
        return this.extra11;
    }

    @Nullable
    public final String getExtra12() {
        return this.extra12;
    }

    @Nullable
    public final String getExtra13() {
        return this.extra13;
    }

    @Nullable
    public final String getExtra14() {
        return this.extra14;
    }

    @Nullable
    public final String getExtra15() {
        return this.extra15;
    }

    @Nullable
    public final String getExtra2() {
        return this.extra2;
    }

    @Nullable
    public final String getExtra3() {
        return this.extra3;
    }

    @Nullable
    public final String getExtra4() {
        return this.extra4;
    }

    @Nullable
    public final String getExtra5() {
        return this.extra5;
    }

    @Nullable
    public final String getExtra6() {
        return this.extra6;
    }

    @Nullable
    public final String getExtra7() {
        return this.extra7;
    }

    @Nullable
    public final String getExtra8() {
        return this.extra8;
    }

    @Nullable
    public final String getExtra9() {
        return this.extra9;
    }

    @Nullable
    public final List<String> getFacilities() {
        return this.facilities;
    }

    @Nullable
    public final String getGMTZone$scanGoLibrary_release() {
        return this.gMTZone;
    }

    @Nullable
    public final String getGeoLevel() {
        return this.geoLevel;
    }

    @Nullable
    public final Images getImages() {
        return this.images;
    }

    @Nullable
    public final String getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final String getLongtitude() {
        return this.longtitude;
    }

    @Nullable
    public final String getManager() {
        return this.manager;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getNo() {
        return this.no;
    }

    public final boolean getNotify_wifi() {
        return this.notify_wifi;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getPostcode() {
        return this.postcode;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final StoreTradingWeek getStoreTradingWeek() {
        return this.storeTradingWeek;
    }

    @Nullable
    public final String getSuburb() {
        return this.suburb;
    }

    public final int getTillid() {
        return this.tillid;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.addressLine1;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine2;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.division;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.extra1;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.extra2;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.extra3;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.extra4;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.extra5;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.extra6;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.extra7;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.extra8;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.extra9;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.extra10;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.extra11;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.extra12;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.extra13;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.extra14;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.extra15;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        List<String> list = this.facilities;
        int iHashCode22 = (iHashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        String str21 = this.geoLevel;
        int iHashCode23 = (iHashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.gMTZone;
        int iHashCode24 = (iHashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Images images = this.images;
        int iHashCode25 = (iHashCode24 + (images == null ? 0 : images.hashCode())) * 31;
        String str23 = this.manager;
        int iA = b.a(this.no, (iHashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31, 31);
        String str24 = this.phone;
        int iHashCode26 = (iA + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.postcode;
        int iHashCode27 = (iHashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.state;
        int iHashCode28 = (iHashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.suburb;
        int iB = a.b(this.distance, (iHashCode28 + (str27 == null ? 0 : str27.hashCode())) * 31, 31);
        String str28 = this.latitude;
        int iHashCode29 = (iB + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.longtitude;
        int iA2 = b.a(this.tillid, (iHashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31, 31);
        StoreTradingWeek storeTradingWeek = this.storeTradingWeek;
        return Boolean.hashCode(this.notify_wifi) + ((iA2 + (storeTradingWeek != null ? storeTradingWeek.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.addressLine1;
        String str3 = this.addressLine2;
        String str4 = this.country;
        String str5 = this.division;
        String str6 = this.email;
        String str7 = this.extra1;
        String str8 = this.extra2;
        String str9 = this.extra3;
        String str10 = this.extra4;
        String str11 = this.extra5;
        String str12 = this.extra6;
        String str13 = this.extra7;
        String str14 = this.extra8;
        String str15 = this.extra9;
        String str16 = this.extra10;
        String str17 = this.extra11;
        String str18 = this.extra12;
        String str19 = this.extra13;
        String str20 = this.extra14;
        String str21 = this.extra15;
        List<String> list = this.facilities;
        String str22 = this.geoLevel;
        String str23 = this.gMTZone;
        Images images = this.images;
        String str24 = this.manager;
        int i = this.no;
        String str25 = this.phone;
        String str26 = this.postcode;
        String str27 = this.state;
        String str28 = this.suburb;
        float f = this.distance;
        String str29 = this.latitude;
        String str30 = this.longtitude;
        int i2 = this.tillid;
        StoreTradingWeek storeTradingWeek = this.storeTradingWeek;
        boolean z = this.notify_wifi;
        StringBuilder sbV = YU.a.v("Store(name=", str, ", addressLine1=", str2, ", addressLine2=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", country=", str4, ", division=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", email=", str6, ", extra1=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", extra2=", str8, ", extra3=");
        androidx.constraintlayout.core.state.a.B(sbV, str9, ", extra4=", str10, ", extra5=");
        androidx.constraintlayout.core.state.a.B(sbV, str11, ", extra6=", str12, ", extra7=");
        androidx.constraintlayout.core.state.a.B(sbV, str13, ", extra8=", str14, ", extra9=");
        androidx.constraintlayout.core.state.a.B(sbV, str15, ", extra10=", str16, ", extra11=");
        androidx.constraintlayout.core.state.a.B(sbV, str17, ", extra12=", str18, ", extra13=");
        androidx.constraintlayout.core.state.a.B(sbV, str19, ", extra14=", str20, ", extra15=");
        au.com.woolworths.android.onesite.a.B(sbV, str21, ", facilities=", list, ", geoLevel=");
        androidx.constraintlayout.core.state.a.B(sbV, str22, ", gMTZone=", str23, ", images=");
        sbV.append(images);
        sbV.append(", manager=");
        sbV.append(str24);
        sbV.append(", no=");
        androidx.compose.ui.input.pointer.a.u(i, ", phone=", str25, ", postcode=", sbV);
        androidx.constraintlayout.core.state.a.B(sbV, str26, ", state=", str27, ", suburb=");
        sbV.append(str28);
        sbV.append(", distance=");
        sbV.append(f);
        sbV.append(", latitude=");
        androidx.constraintlayout.core.state.a.B(sbV, str29, ", longtitude=", str30, ", tillid=");
        sbV.append(i2);
        sbV.append(", storeTradingWeek=");
        sbV.append(storeTradingWeek);
        sbV.append(", notify_wifi=");
        return YU.a.k(")", sbV, z);
    }

    public /* synthetic */ Store(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List list, String str22, String str23, Images images, String str24, int i, String str25, String str26, String str27, String str28, float f, String str29, String str30, int i2, StoreTradingWeek storeTradingWeek, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? null : str7, (i3 & 128) != 0 ? null : str8, (i3 & 256) != 0 ? null : str9, (i3 & 512) != 0 ? null : str10, (i3 & 1024) != 0 ? null : str11, (i3 & 2048) != 0 ? null : str12, (i3 & 4096) != 0 ? null : str13, (i3 & 8192) != 0 ? null : str14, (i3 & 16384) != 0 ? null : str15, (i3 & 32768) != 0 ? null : str16, (i3 & 65536) != 0 ? null : str17, (i3 & 131072) != 0 ? null : str18, (i3 & 262144) != 0 ? null : str19, (i3 & 524288) != 0 ? null : str20, (i3 & 1048576) != 0 ? null : str21, (i3 & 2097152) != 0 ? null : list, (i3 & 4194304) != 0 ? null : str22, (i3 & 8388608) != 0 ? null : str23, (i3 & 16777216) != 0 ? null : images, (i3 & 33554432) != 0 ? null : str24, (i3 & 67108864) != 0 ? 0 : i, (i3 & 134217728) != 0 ? null : str25, (i3 & 268435456) != 0 ? null : str26, (i3 & 536870912) != 0 ? null : str27, (i3 & 1073741824) != 0 ? null : str28, (i3 & Integer.MIN_VALUE) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i4 & 1) != 0 ? null : str29, (i4 & 2) != 0 ? null : str30, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? storeTradingWeek : null, (i4 & 16) != 0 ? false : z);
    }
}
