package me.oriient.ipssdk.realtime.services.rest.responses;

import YU.a;
import androidx.annotation.Keep;
import com.salesforce.marketingcloud.messages.iam.j;
import com.salesforce.marketingcloud.storage.db.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.ipssdk.api.models.IPSContentItem;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSPlacement;
import me.oriient.ipssdk.base.rest.RestException;
import me.oriient.ipssdk.common.utils.models.PostProcessable;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import me.oriient.ipssdk.realtime.utils.models.LocationTag;
import me.oriient.ipssdk.realtime.utils.models.PlacementInBuilding;
import me.oriient.ipssdk.realtime.utils.models.ProximityTrigger;
import me.oriient.ipssdk.realtime.utils.models.Region;
import me.oriient.ipssdk.realtime.utils.models.RegionAttachment;
import me.oriient.ipssdk.realtime.utils.models.RegionPlacementInBuilding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u0097\u00012\u00020\u0001:\u0006\u0096\u0001\u0097\u0001\u0098\u0001B\u0091\u0002\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\f\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f\u0012\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"B£\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f¢\u0006\u0002\u0010#J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fHÆ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fHÆ\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\fHÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010Z\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\fHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fHÆ\u0003J¬\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\f2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010jJ\u0013\u0010k\u001a\u00020l2\b\u0010m\u001a\u0004\u0018\u00010nHÖ\u0003J \u0010o\u001a\b\u0012\u0004\u0012\u00020p0\f2\u0006\u0010q\u001a\u00020rH\u0002ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ\t\u0010u\u001a\u00020\u0003HÖ\u0001J\u0018\u0010v\u001a\u00020w2\u0006\u0010q\u001a\u00020rø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\u0018\u0010z\u001a\u00020{2\u0006\u0010q\u001a\u00020rø\u0001\u0000¢\u0006\u0004\b|\u0010}J\u0018\u0010~\u001a\u00020{2\u0006\u0010q\u001a\u00020rø\u0001\u0000¢\u0006\u0004\b\u007f\u0010}J\u001c\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010q\u001a\u00020rø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J,\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010q\u001a\u00020r2\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\fø\u0001\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00030\u0081\u00012\u0006\u0010q\u001a\u00020rø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u0083\u0001J\n\u0010\u008a\u0001\u001a\u00020\u0007HÖ\u0001J\u001a\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020\u00072\u0007\u0010\u008e\u0001\u001a\u00020\u0003J.\u0010\u008f\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0090\u0001\u001a\u00020\u00002\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001HÁ\u0001¢\u0006\u0003\b\u0095\u0001R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010/\"\u0004\b;\u00101R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010%\"\u0004\b=\u0010'R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010/\"\u0004\bF\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010/\"\u0004\bH\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010/\"\u0004\bJ\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010/\"\u0004\bL\u00101R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010%\"\u0004\bN\u0010'R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010%\"\u0004\bP\u0010'R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0099\u0001"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/Content;", "Lme/oriient/ipssdk/common/utils/models/PostProcessable;", "seen1", "", "type", "Lme/oriient/ipssdk/realtime/services/rest/responses/Content$Type;", "contentType", "", "regionId", "regionName", "regionMetadata", "attachedTriggers", "", "placements", "", "Lme/oriient/ipssdk/realtime/services/rest/responses/PlacementResponse;", "regionType", "topRight", "", "bottomLeft", "center", "points", "Lme/oriient/ipssdk/realtime/services/rest/responses/PointResponse;", "radius", "locTagId", "locTagName", "locTagDesc", "locTagUrl", "locTagMetadata", "regionsPlacements", "Lme/oriient/ipssdk/realtime/services/rest/responses/AttachmentToRegion;", "alternatives", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/ipssdk/realtime/services/rest/responses/Content$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/ipssdk/realtime/services/rest/responses/Content$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAlternatives", "()Ljava/util/List;", "setAlternatives", "(Ljava/util/List;)V", "getAttachedTriggers", "setAttachedTriggers", "getBottomLeft", "setBottomLeft", "getCenter", "setCenter", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getLocTagDesc", "setLocTagDesc", "getLocTagId", "setLocTagId", "getLocTagMetadata", "setLocTagMetadata", "getLocTagName", "setLocTagName", "getLocTagUrl", "setLocTagUrl", "getPlacements", "setPlacements", "getPoints", "setPoints", "getRadius", "()Ljava/lang/Double;", "setRadius", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRegionId", "setRegionId", "getRegionMetadata", "setRegionMetadata", "getRegionName", "setRegionName", "getRegionType", "setRegionType", "getRegionsPlacements", "setRegionsPlacements", "getTopRight", "setTopRight", "getType", "()Lme/oriient/ipssdk/realtime/services/rest/responses/Content$Type;", "setType", "(Lme/oriient/ipssdk/realtime/services/rest/responses/Content$Type;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lme/oriient/ipssdk/realtime/services/rest/responses/Content$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lme/oriient/ipssdk/realtime/services/rest/responses/Content;", "equals", "", "other", "", "getLocTagPlacements", "Lme/oriient/ipssdk/realtime/utils/models/PlacementInBuilding;", "buildingId", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "getLocTagPlacements-TVSKQeo", "(Ljava/lang/String;)Ljava/util/List;", "hashCode", "toIpsContentItem", "Lme/oriient/ipssdk/api/models/IPSContentItem;", "toIpsContentItem-TVSKQeo", "(Ljava/lang/String;)Lme/oriient/ipssdk/api/models/IPSContentItem;", "toLocationTag", "Lme/oriient/ipssdk/realtime/utils/models/LocationTag;", "toLocationTag-TVSKQeo", "(Ljava/lang/String;)Lme/oriient/ipssdk/realtime/utils/models/LocationTag;", "toPlacedLocationTag", "toPlacedLocationTag-TVSKQeo", "toPlacedRegion", "Lme/oriient/ipssdk/realtime/utils/models/Region;", "toPlacedRegion-TVSKQeo", "(Ljava/lang/String;)Lme/oriient/ipssdk/realtime/utils/models/Region;", m.g, "Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "toPlacedRegion-OsxN4L8", "(Ljava/lang/String;Ljava/util/List;)Lme/oriient/ipssdk/realtime/utils/models/Region;", "toRegion", "toRegion-TVSKQeo", "toString", "tryToPopulateOldRegionAttachments", "", "mapId", "floorOrder", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "Type", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class Content implements PostProcessable {

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<Content> alternatives;

    @Nullable
    private List<String> attachedTriggers;

    @Nullable
    private List<Double> bottomLeft;

    @Nullable
    private List<Double> center;

    @Nullable
    private String contentType;

    @Nullable
    private String locTagDesc;

    @Nullable
    private String locTagId;

    @Nullable
    private String locTagMetadata;

    @Nullable
    private String locTagName;

    @Nullable
    private String locTagUrl;

    @Nullable
    private List<PlacementResponse> placements;

    @Nullable
    private List<PointResponse> points;

    @Nullable
    private Double radius;

    @Nullable
    private String regionId;

    @Nullable
    private String regionMetadata;

    @Nullable
    private String regionName;

    @Nullable
    private String regionType;

    @Nullable
    private List<AttachmentToRegion> regionsPlacements;

    @Nullable
    private List<Double> topRight;

    @NotNull
    private Type type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/Content$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/Content;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<Content> serializer() {
            return Content$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/Content$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNKNOWN", "REGION", "LOCATION_TAG", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @NotNull
        private final String value;
        public static final Type UNKNOWN = new Type("UNKNOWN", 0, j.h);
        public static final Type REGION = new Type("REGION", 1, "region");
        public static final Type LOCATION_TAG = new Type("LOCATION_TAG", 2, "location-tag");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{UNKNOWN, REGION, LOCATION_TAG};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.a(typeArr$values);
        }

        private Type(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.REGION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.LOCATION_TAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        EnumSerializer enumSerializerB = EnumsKt.b(Type.values(), "me.oriient.ipssdk.realtime.services.rest.responses.Content.Type");
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(StringSerializer.f24821a);
        ArrayListSerializer arrayListSerializer2 = new ArrayListSerializer(PlacementResponse$$serializer.INSTANCE);
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        $childSerializers = new KSerializer[]{enumSerializerB, null, null, null, null, arrayListSerializer, arrayListSerializer2, null, new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(PointResponse$$serializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(AttachmentToRegion$$serializer.INSTANCE), null};
    }

    public Content() {
        this((Type) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (List) null, (List) null, (List) null, (List) null, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 1048575, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Content copy$default(Content content, Type type, String str, String str2, String str3, String str4, List list, List list2, String str5, List list3, List list4, List list5, List list6, Double d, String str6, String str7, String str8, String str9, String str10, List list7, List list8, int i, Object obj) {
        List list9;
        List list10;
        Type type2 = (i & 1) != 0 ? content.type : type;
        String str11 = (i & 2) != 0 ? content.contentType : str;
        String str12 = (i & 4) != 0 ? content.regionId : str2;
        String str13 = (i & 8) != 0 ? content.regionName : str3;
        String str14 = (i & 16) != 0 ? content.regionMetadata : str4;
        List list11 = (i & 32) != 0 ? content.attachedTriggers : list;
        List list12 = (i & 64) != 0 ? content.placements : list2;
        String str15 = (i & 128) != 0 ? content.regionType : str5;
        List list13 = (i & 256) != 0 ? content.topRight : list3;
        List list14 = (i & 512) != 0 ? content.bottomLeft : list4;
        List list15 = (i & 1024) != 0 ? content.center : list5;
        List list16 = (i & 2048) != 0 ? content.points : list6;
        Double d2 = (i & 4096) != 0 ? content.radius : d;
        String str16 = (i & 8192) != 0 ? content.locTagId : str6;
        Type type3 = type2;
        String str17 = (i & 16384) != 0 ? content.locTagName : str7;
        String str18 = (i & 32768) != 0 ? content.locTagDesc : str8;
        String str19 = (i & 65536) != 0 ? content.locTagUrl : str9;
        String str20 = (i & 131072) != 0 ? content.locTagMetadata : str10;
        List list17 = (i & 262144) != 0 ? content.regionsPlacements : list7;
        if ((i & 524288) != 0) {
            list10 = list17;
            list9 = content.alternatives;
        } else {
            list9 = list8;
            list10 = list17;
        }
        return content.copy(type3, str11, str12, str13, str14, list11, list12, str15, list13, list14, list15, list16, d2, str16, str17, str18, str19, str20, list10, list9);
    }

    /* renamed from: getLocTagPlacements-TVSKQeo, reason: not valid java name */
    private final List<PlacementInBuilding> m464getLocTagPlacementsTVSKQeo(String buildingId) {
        ArrayList arrayList = new ArrayList();
        List<PlacementResponse> list = this.placements;
        if (list == null || list.isEmpty()) {
            List<Content> list2 = this.alternatives;
            if (list2 != null && !list2.isEmpty()) {
                List<Content> list3 = this.alternatives;
                Intrinsics.e(list3);
                for (Content content : list3) {
                    List<PlacementResponse> list4 = content.placements;
                    if (list4 != null && !list4.isEmpty()) {
                        List<PlacementResponse> list5 = content.placements;
                        Intrinsics.e(list5);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list5, 10));
                        Iterator<T> it = list5.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((PlacementResponse) it.next()).m472toPlacementInBuildingTVSKQeo(buildingId));
                        }
                        arrayList.addAll(arrayList2);
                    }
                }
            }
        } else {
            List<PlacementResponse> list6 = this.placements;
            Intrinsics.e(list6);
            Iterator<T> it2 = list6.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PlacementResponse) it2.next()).m472toPlacementInBuildingTVSKQeo(buildingId));
            }
        }
        return arrayList;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(Content self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.type != Type.UNKNOWN) {
            output.F(serialDesc, 0, kSerializerArr[0], self.type);
        }
        if (output.q(serialDesc, 1) || self.contentType != null) {
            output.w(serialDesc, 1, StringSerializer.f24821a, self.contentType);
        }
        if (output.q(serialDesc, 2) || self.regionId != null) {
            output.w(serialDesc, 2, StringSerializer.f24821a, self.regionId);
        }
        if (output.q(serialDesc, 3) || self.regionName != null) {
            output.w(serialDesc, 3, StringSerializer.f24821a, self.regionName);
        }
        if (output.q(serialDesc, 4) || self.regionMetadata != null) {
            output.w(serialDesc, 4, StringSerializer.f24821a, self.regionMetadata);
        }
        if (output.q(serialDesc, 5) || self.attachedTriggers != null) {
            output.w(serialDesc, 5, kSerializerArr[5], self.attachedTriggers);
        }
        if (output.q(serialDesc, 6) || !Intrinsics.c(self.placements, new ArrayList())) {
            output.w(serialDesc, 6, kSerializerArr[6], self.placements);
        }
        if (output.q(serialDesc, 7) || self.regionType != null) {
            output.w(serialDesc, 7, StringSerializer.f24821a, self.regionType);
        }
        boolean zQ = output.q(serialDesc, 8);
        EmptyList emptyList = EmptyList.d;
        if (zQ || !Intrinsics.c(self.topRight, emptyList)) {
            output.w(serialDesc, 8, kSerializerArr[8], self.topRight);
        }
        if (output.q(serialDesc, 9) || !Intrinsics.c(self.bottomLeft, emptyList)) {
            output.w(serialDesc, 9, kSerializerArr[9], self.bottomLeft);
        }
        if (output.q(serialDesc, 10) || !Intrinsics.c(self.center, emptyList)) {
            output.w(serialDesc, 10, kSerializerArr[10], self.center);
        }
        if (output.q(serialDesc, 11) || self.points != null) {
            output.w(serialDesc, 11, kSerializerArr[11], self.points);
        }
        if (output.q(serialDesc, 12) || self.radius != null) {
            output.w(serialDesc, 12, DoubleSerializer.f24792a, self.radius);
        }
        if (output.q(serialDesc, 13) || self.locTagId != null) {
            output.w(serialDesc, 13, StringSerializer.f24821a, self.locTagId);
        }
        if (output.q(serialDesc, 14) || self.locTagName != null) {
            output.w(serialDesc, 14, StringSerializer.f24821a, self.locTagName);
        }
        if (output.q(serialDesc, 15) || self.locTagDesc != null) {
            output.w(serialDesc, 15, StringSerializer.f24821a, self.locTagDesc);
        }
        if (output.q(serialDesc, 16) || self.locTagUrl != null) {
            output.w(serialDesc, 16, StringSerializer.f24821a, self.locTagUrl);
        }
        if (output.q(serialDesc, 17) || self.locTagMetadata != null) {
            output.w(serialDesc, 17, StringSerializer.f24821a, self.locTagMetadata);
        }
        if (output.q(serialDesc, 18) || !Intrinsics.c(self.regionsPlacements, emptyList)) {
            output.w(serialDesc, 18, kSerializerArr[18], self.regionsPlacements);
        }
        if (!output.q(serialDesc, 19) && Intrinsics.c(self.alternatives, emptyList)) {
            return;
        }
        output.w(serialDesc, 19, new ArrayListSerializer(Content$$serializer.INSTANCE), self.alternatives);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final List<Double> component10() {
        return this.bottomLeft;
    }

    @Nullable
    public final List<Double> component11() {
        return this.center;
    }

    @Nullable
    public final List<PointResponse> component12() {
        return this.points;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getRadius() {
        return this.radius;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getLocTagId() {
        return this.locTagId;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getLocTagName() {
        return this.locTagName;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getLocTagDesc() {
        return this.locTagDesc;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getLocTagUrl() {
        return this.locTagUrl;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getLocTagMetadata() {
        return this.locTagMetadata;
    }

    @Nullable
    public final List<AttachmentToRegion> component19() {
        return this.regionsPlacements;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final List<Content> component20() {
        return this.alternatives;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRegionId() {
        return this.regionId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRegionName() {
        return this.regionName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRegionMetadata() {
        return this.regionMetadata;
    }

    @Nullable
    public final List<String> component6() {
        return this.attachedTriggers;
    }

    @Nullable
    public final List<PlacementResponse> component7() {
        return this.placements;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getRegionType() {
        return this.regionType;
    }

    @Nullable
    public final List<Double> component9() {
        return this.topRight;
    }

    @NotNull
    public final Content copy(@NotNull Type type, @Nullable String contentType, @Nullable String regionId, @Nullable String regionName, @Nullable String regionMetadata, @Nullable List<String> attachedTriggers, @Nullable List<PlacementResponse> placements, @Nullable String regionType, @Nullable List<Double> topRight, @Nullable List<Double> bottomLeft, @Nullable List<Double> center, @Nullable List<PointResponse> points, @Nullable Double radius, @Nullable String locTagId, @Nullable String locTagName, @Nullable String locTagDesc, @Nullable String locTagUrl, @Nullable String locTagMetadata, @Nullable List<AttachmentToRegion> regionsPlacements, @Nullable List<Content> alternatives) {
        Intrinsics.h(type, "type");
        return new Content(type, contentType, regionId, regionName, regionMetadata, attachedTriggers, placements, regionType, topRight, bottomLeft, center, points, radius, locTagId, locTagName, locTagDesc, locTagUrl, locTagMetadata, regionsPlacements, alternatives);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Content)) {
            return false;
        }
        Content content = (Content) other;
        return this.type == content.type && Intrinsics.c(this.contentType, content.contentType) && Intrinsics.c(this.regionId, content.regionId) && Intrinsics.c(this.regionName, content.regionName) && Intrinsics.c(this.regionMetadata, content.regionMetadata) && Intrinsics.c(this.attachedTriggers, content.attachedTriggers) && Intrinsics.c(this.placements, content.placements) && Intrinsics.c(this.regionType, content.regionType) && Intrinsics.c(this.topRight, content.topRight) && Intrinsics.c(this.bottomLeft, content.bottomLeft) && Intrinsics.c(this.center, content.center) && Intrinsics.c(this.points, content.points) && Intrinsics.c(this.radius, content.radius) && Intrinsics.c(this.locTagId, content.locTagId) && Intrinsics.c(this.locTagName, content.locTagName) && Intrinsics.c(this.locTagDesc, content.locTagDesc) && Intrinsics.c(this.locTagUrl, content.locTagUrl) && Intrinsics.c(this.locTagMetadata, content.locTagMetadata) && Intrinsics.c(this.regionsPlacements, content.regionsPlacements) && Intrinsics.c(this.alternatives, content.alternatives);
    }

    @Nullable
    public final List<Content> getAlternatives() {
        return this.alternatives;
    }

    @Nullable
    public final List<String> getAttachedTriggers() {
        return this.attachedTriggers;
    }

    @Nullable
    public final List<Double> getBottomLeft() {
        return this.bottomLeft;
    }

    @Nullable
    public final List<Double> getCenter() {
        return this.center;
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getLocTagDesc() {
        return this.locTagDesc;
    }

    @Nullable
    public final String getLocTagId() {
        return this.locTagId;
    }

    @Nullable
    public final String getLocTagMetadata() {
        return this.locTagMetadata;
    }

    @Nullable
    public final String getLocTagName() {
        return this.locTagName;
    }

    @Nullable
    public final String getLocTagUrl() {
        return this.locTagUrl;
    }

    @Nullable
    public final List<PlacementResponse> getPlacements() {
        return this.placements;
    }

    @Nullable
    public final List<PointResponse> getPoints() {
        return this.points;
    }

    @Nullable
    public final Double getRadius() {
        return this.radius;
    }

    @Nullable
    public final String getRegionId() {
        return this.regionId;
    }

    @Nullable
    public final String getRegionMetadata() {
        return this.regionMetadata;
    }

    @Nullable
    public final String getRegionName() {
        return this.regionName;
    }

    @Nullable
    public final String getRegionType() {
        return this.regionType;
    }

    @Nullable
    public final List<AttachmentToRegion> getRegionsPlacements() {
        return this.regionsPlacements;
    }

    @Nullable
    public final List<Double> getTopRight() {
        return this.topRight;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.contentType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.regionId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.regionMetadata;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.attachedTriggers;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<PlacementResponse> list2 = this.placements;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.regionType;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<Double> list3 = this.topRight;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Double> list4 = this.bottomLeft;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Double> list5 = this.center;
        int iHashCode11 = (iHashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<PointResponse> list6 = this.points;
        int iHashCode12 = (iHashCode11 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Double d = this.radius;
        int iHashCode13 = (iHashCode12 + (d == null ? 0 : d.hashCode())) * 31;
        String str6 = this.locTagId;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.locTagName;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.locTagDesc;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.locTagUrl;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.locTagMetadata;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<AttachmentToRegion> list7 = this.regionsPlacements;
        int iHashCode19 = (iHashCode18 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<Content> list8 = this.alternatives;
        return iHashCode19 + (list8 != null ? list8.hashCode() : 0);
    }

    public final void setAlternatives(@Nullable List<Content> list) {
        this.alternatives = list;
    }

    public final void setAttachedTriggers(@Nullable List<String> list) {
        this.attachedTriggers = list;
    }

    public final void setBottomLeft(@Nullable List<Double> list) {
        this.bottomLeft = list;
    }

    public final void setCenter(@Nullable List<Double> list) {
        this.center = list;
    }

    public final void setContentType(@Nullable String str) {
        this.contentType = str;
    }

    public final void setLocTagDesc(@Nullable String str) {
        this.locTagDesc = str;
    }

    public final void setLocTagId(@Nullable String str) {
        this.locTagId = str;
    }

    public final void setLocTagMetadata(@Nullable String str) {
        this.locTagMetadata = str;
    }

    public final void setLocTagName(@Nullable String str) {
        this.locTagName = str;
    }

    public final void setLocTagUrl(@Nullable String str) {
        this.locTagUrl = str;
    }

    public final void setPlacements(@Nullable List<PlacementResponse> list) {
        this.placements = list;
    }

    public final void setPoints(@Nullable List<PointResponse> list) {
        this.points = list;
    }

    public final void setRadius(@Nullable Double d) {
        this.radius = d;
    }

    public final void setRegionId(@Nullable String str) {
        this.regionId = str;
    }

    public final void setRegionMetadata(@Nullable String str) {
        this.regionMetadata = str;
    }

    public final void setRegionName(@Nullable String str) {
        this.regionName = str;
    }

    public final void setRegionType(@Nullable String str) {
        this.regionType = str;
    }

    public final void setRegionsPlacements(@Nullable List<AttachmentToRegion> list) {
        this.regionsPlacements = list;
    }

    public final void setTopRight(@Nullable List<Double> list) {
        this.topRight = list;
    }

    public final void setType(@NotNull Type type) {
        Intrinsics.h(type, "<set-?>");
        this.type = type;
    }

    @NotNull
    /* renamed from: toIpsContentItem-TVSKQeo, reason: not valid java name */
    public final IPSContentItem m465toIpsContentItemTVSKQeo(@NotNull String buildingId) throws RestException {
        Intrinsics.h(buildingId, "buildingId");
        Type type = this.type;
        Type type2 = Type.UNKNOWN;
        if (type == type2) {
            String str = this.contentType;
            if (Intrinsics.c(str, "region")) {
                type2 = Type.REGION;
            } else if (Intrinsics.c(str, "location-tag")) {
                type2 = Type.LOCATION_TAG;
            }
            this.type = type2;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            return m470toRegionTVSKQeo(buildingId);
        }
        if (i == 2) {
            return m466toLocationTagTVSKQeo(buildingId);
        }
        throw new RestException("Content of unknown type " + this.contentType);
    }

    @NotNull
    /* renamed from: toLocationTag-TVSKQeo, reason: not valid java name */
    public final LocationTag m466toLocationTagTVSKQeo(@NotNull String buildingId) {
        Coordinate coordinate;
        Intrinsics.h(buildingId, "buildingId");
        List<PlacementInBuilding> listM464getLocTagPlacementsTVSKQeo = m464getLocTagPlacementsTVSKQeo(buildingId);
        ArrayList arrayList = new ArrayList();
        List<AttachmentToRegion> list = this.regionsPlacements;
        if (list != null && !list.isEmpty()) {
            List<AttachmentToRegion> list2 = this.regionsPlacements;
            Intrinsics.e(list2);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AttachmentToRegion) it.next()).m463toRegionAttachmentTVSKQeo(buildingId));
            }
            arrayList.addAll(arrayList2);
        }
        if (listM464getLocTagPlacementsTVSKQeo != null && !listM464getLocTagPlacementsTVSKQeo.isEmpty()) {
            coordinate = listM464getLocTagPlacementsTVSKQeo.get(0).getCoordinate();
        } else if (arrayList.isEmpty()) {
            coordinate = null;
        } else {
            IPSCoordinate center = ((RegionAttachment) arrayList.get(0)).getAttachedToRegion().getPlacements().get(0).getShape().getCenter();
            Intrinsics.f(center, "null cannot be cast to non-null type me.oriient.ipssdk.realtime.utils.models.Coordinate");
            coordinate = (Coordinate) center;
        }
        Coordinate coordinate2 = coordinate;
        String str = this.locTagId;
        Intrinsics.e(str);
        String str2 = this.locTagName;
        if (str2 == null) {
            str2 = "";
        }
        return new LocationTag(str, str2, this.locTagDesc, this.locTagUrl, this.locTagMetadata, coordinate2, listM464getLocTagPlacementsTVSKQeo, arrayList);
    }

    @NotNull
    /* renamed from: toPlacedLocationTag-TVSKQeo, reason: not valid java name */
    public final LocationTag m467toPlacedLocationTagTVSKQeo(@NotNull String buildingId) throws RestException {
        List<AttachmentToRegion> list;
        Intrinsics.h(buildingId, "buildingId");
        LocationTag locationTagM466toLocationTagTVSKQeo = m466toLocationTagTVSKQeo(buildingId);
        List<IPSPlacement> placements = locationTagM466toLocationTagTVSKQeo.getPlacements();
        if ((placements == null || placements.isEmpty()) && ((list = this.regionsPlacements) == null || list.isEmpty())) {
            throw new RestException(a.o(new StringBuilder("Location tag "), this.locTagName, " has no placements"));
        }
        return locationTagM466toLocationTagTVSKQeo;
    }

    @NotNull
    /* renamed from: toPlacedRegion-OsxN4L8, reason: not valid java name */
    public final Region m468toPlacedRegionOsxN4L8(@NotNull String buildingId, @NotNull List<ProximityTrigger> triggers) throws RestException {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(triggers, "triggers");
        Region regionM469toPlacedRegionTVSKQeo = m469toPlacedRegionTVSKQeo(buildingId);
        int iH = MapsKt.h(CollectionsKt.s(triggers, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (ProximityTrigger proximityTrigger : triggers) {
            linkedHashMap.put(proximityTrigger.getF26200a(), proximityTrigger);
        }
        List<String> list = this.attachedTriggers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ProximityTrigger proximityTrigger2 = (ProximityTrigger) linkedHashMap.get((String) it.next());
                if (proximityTrigger2 != null) {
                    regionM469toPlacedRegionTVSKQeo.triggers.add(proximityTrigger2);
                }
            }
        }
        return regionM469toPlacedRegionTVSKQeo;
    }

    @NotNull
    /* renamed from: toPlacedRegion-TVSKQeo, reason: not valid java name */
    public final Region m469toPlacedRegionTVSKQeo(@NotNull String buildingId) throws RestException {
        Intrinsics.h(buildingId, "buildingId");
        Region regionM470toRegionTVSKQeo = m470toRegionTVSKQeo(buildingId);
        List<? extends RegionPlacementInBuilding> list = regionM470toRegionTVSKQeo.placements;
        if (list == null || list.isEmpty()) {
            throw new RestException(a.o(new StringBuilder("Region "), this.regionName, " has no placements"));
        }
        return regionM470toRegionTVSKQeo;
    }

    @NotNull
    /* renamed from: toRegion-TVSKQeo, reason: not valid java name */
    public final Region m470toRegionTVSKQeo(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        String str = this.regionId;
        Intrinsics.e(str);
        String str2 = this.regionName;
        Intrinsics.e(str2);
        Region region = new Region(str, str2, this.regionMetadata);
        ArrayList arrayList = new ArrayList();
        List<PlacementResponse> list = this.placements;
        if (list != null && !list.isEmpty()) {
            List<PlacementResponse> list2 = this.placements;
            Intrinsics.e(list2);
            Iterator<PlacementResponse> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m473toRegionPlacementInBuildingTVSKQeo(buildingId));
            }
            region.placements = arrayList;
        }
        return region;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Content(type=");
        sb.append(this.type);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", regionId=");
        sb.append(this.regionId);
        sb.append(", regionName=");
        sb.append(this.regionName);
        sb.append(", regionMetadata=");
        sb.append(this.regionMetadata);
        sb.append(", attachedTriggers=");
        sb.append(this.attachedTriggers);
        sb.append(", placements=");
        sb.append(this.placements);
        sb.append(", regionType=");
        sb.append(this.regionType);
        sb.append(", topRight=");
        sb.append(this.topRight);
        sb.append(", bottomLeft=");
        sb.append(this.bottomLeft);
        sb.append(", center=");
        sb.append(this.center);
        sb.append(", points=");
        sb.append(this.points);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", locTagId=");
        sb.append(this.locTagId);
        sb.append(", locTagName=");
        sb.append(this.locTagName);
        sb.append(", locTagDesc=");
        sb.append(this.locTagDesc);
        sb.append(", locTagUrl=");
        sb.append(this.locTagUrl);
        sb.append(", locTagMetadata=");
        sb.append(this.locTagMetadata);
        sb.append(", regionsPlacements=");
        sb.append(this.regionsPlacements);
        sb.append(", alternatives=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.alternatives, ')');
    }

    public final void tryToPopulateOldRegionAttachments(@NotNull String mapId, int floorOrder) {
        Intrinsics.h(mapId, "mapId");
        List<PlacementResponse> list = this.placements;
        Intrinsics.e(list);
        if (list.isEmpty()) {
            List<PlacementResponse> list2 = this.placements;
            Intrinsics.e(list2);
            PlacementResponse placementResponse = new PlacementResponse((String) null, (Integer) null, (String) null, (Integer) null, (String) null, (List) null, (List) null, (List) null, (Double) null, (List) null, (List) null, 2047, (DefaultConstructorMarker) null);
            placementResponse.setPlacementId(UUID.randomUUID().toString());
            placementResponse.setMapId(mapId);
            placementResponse.setFloorIndex(Integer.valueOf(floorOrder));
            placementResponse.setRegionType(this.regionType);
            placementResponse.setTopRight(this.topRight);
            placementResponse.setBottomLeft(this.bottomLeft);
            placementResponse.setCenter(this.center);
            placementResponse.setRadius(this.radius);
            placementResponse.setPoints(this.points);
            list2.add(placementResponse);
        }
    }

    @Deprecated
    public /* synthetic */ Content(int i, Type type, String str, String str2, String str3, String str4, List list, List list2, String str5, List list3, List list4, List list5, List list6, Double d, String str6, String str7, String str8, String str9, String str10, List list7, List list8, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i & 1) == 0 ? Type.UNKNOWN : type;
        if ((i & 2) == 0) {
            this.contentType = null;
        } else {
            this.contentType = str;
        }
        if ((i & 4) == 0) {
            this.regionId = null;
        } else {
            this.regionId = str2;
        }
        if ((i & 8) == 0) {
            this.regionName = null;
        } else {
            this.regionName = str3;
        }
        if ((i & 16) == 0) {
            this.regionMetadata = null;
        } else {
            this.regionMetadata = str4;
        }
        if ((i & 32) == 0) {
            this.attachedTriggers = null;
        } else {
            this.attachedTriggers = list;
        }
        if ((i & 64) == 0) {
            this.placements = new ArrayList();
        } else {
            this.placements = list2;
        }
        if ((i & 128) == 0) {
            this.regionType = null;
        } else {
            this.regionType = str5;
        }
        int i2 = i & 256;
        EmptyList emptyList = EmptyList.d;
        if (i2 == 0) {
            this.topRight = emptyList;
        } else {
            this.topRight = list3;
        }
        if ((i & 512) == 0) {
            this.bottomLeft = emptyList;
        } else {
            this.bottomLeft = list4;
        }
        if ((i & 1024) == 0) {
            this.center = emptyList;
        } else {
            this.center = list5;
        }
        if ((i & 2048) == 0) {
            this.points = null;
        } else {
            this.points = list6;
        }
        if ((i & 4096) == 0) {
            this.radius = null;
        } else {
            this.radius = d;
        }
        if ((i & 8192) == 0) {
            this.locTagId = null;
        } else {
            this.locTagId = str6;
        }
        if ((i & 16384) == 0) {
            this.locTagName = null;
        } else {
            this.locTagName = str7;
        }
        if ((32768 & i) == 0) {
            this.locTagDesc = null;
        } else {
            this.locTagDesc = str8;
        }
        if ((65536 & i) == 0) {
            this.locTagUrl = null;
        } else {
            this.locTagUrl = str9;
        }
        if ((131072 & i) == 0) {
            this.locTagMetadata = null;
        } else {
            this.locTagMetadata = str10;
        }
        if ((262144 & i) == 0) {
            this.regionsPlacements = emptyList;
        } else {
            this.regionsPlacements = list7;
        }
        if ((i & 524288) == 0) {
            this.alternatives = emptyList;
        } else {
            this.alternatives = list8;
        }
    }

    public Content(@NotNull Type type, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable List<PlacementResponse> list2, @Nullable String str5, @Nullable List<Double> list3, @Nullable List<Double> list4, @Nullable List<Double> list5, @Nullable List<PointResponse> list6, @Nullable Double d, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable List<AttachmentToRegion> list7, @Nullable List<Content> list8) {
        Intrinsics.h(type, "type");
        this.type = type;
        this.contentType = str;
        this.regionId = str2;
        this.regionName = str3;
        this.regionMetadata = str4;
        this.attachedTriggers = list;
        this.placements = list2;
        this.regionType = str5;
        this.topRight = list3;
        this.bottomLeft = list4;
        this.center = list5;
        this.points = list6;
        this.radius = d;
        this.locTagId = str6;
        this.locTagName = str7;
        this.locTagDesc = str8;
        this.locTagUrl = str9;
        this.locTagMetadata = str10;
        this.regionsPlacements = list7;
        this.alternatives = list8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Content(Type type, String str, String str2, String str3, String str4, List list, List list2, String str5, List list3, List list4, List list5, List list6, Double d, String str6, String str7, String str8, String str9, String str10, List list7, List list8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Type type2 = (i & 1) != 0 ? Type.UNKNOWN : type;
        String str11 = (i & 2) != 0 ? null : str;
        String str12 = (i & 4) != 0 ? null : str2;
        String str13 = (i & 8) != 0 ? null : str3;
        String str14 = (i & 16) != 0 ? null : str4;
        List list9 = (i & 32) != 0 ? null : list;
        List arrayList = (i & 64) != 0 ? new ArrayList() : list2;
        String str15 = (i & 128) != 0 ? null : str5;
        int i2 = i & 256;
        EmptyList emptyList = EmptyList.d;
        this(type2, str11, str12, str13, str14, list9, arrayList, str15, i2 != 0 ? emptyList : list3, (i & 512) != 0 ? emptyList : list4, (i & 1024) != 0 ? emptyList : list5, (i & 2048) != 0 ? null : list6, (i & 4096) != 0 ? null : d, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? null : str8, (i & 65536) != 0 ? null : str9, (i & 131072) != 0 ? null : str10, (i & 262144) != 0 ? emptyList : list7, (i & 524288) != 0 ? emptyList : list8);
    }
}
