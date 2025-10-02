package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.v;
import me.oriient.positioningengine.common.x;
import me.oriient.positioningengine.common.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0003\b\u0098\u0001\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u009b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010#\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u0006\u0010%\u001a\u00020\n\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\n\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010+\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020\n\u0012\u0006\u0010-\u001a\u00020\n\u0012\u0006\u0010.\u001a\u00020\n\u0012\u0006\u0010/\u001a\u00020\n\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u00101\u001a\u00020\u0007\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u00105\u001a\u00020\n\u0012\u0006\u00106\u001a\u00020\n\u0012\u0006\u00107\u001a\u00020\n¢\u0006\u0002\u00108J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\nHÆ\u0003J\t\u0010o\u001a\u00020\nHÆ\u0003J\t\u0010p\u001a\u00020\nHÆ\u0003J\t\u0010q\u001a\u00020\nHÆ\u0003J\t\u0010r\u001a\u00020\nHÆ\u0003J\t\u0010s\u001a\u00020\nHÆ\u0003J\t\u0010t\u001a\u00020\nHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010w\u001a\u00020\nHÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\u0005HÆ\u0003J\t\u0010z\u001a\u00020\nHÆ\u0003J\t\u0010{\u001a\u00020\nHÆ\u0003J\t\u0010|\u001a\u00020\nHÆ\u0003J\t\u0010}\u001a\u00020\nHÆ\u0003J\t\u0010~\u001a\u00020\nHÆ\u0003J\t\u0010\u007f\u001a\u00020\nHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\nHÆ\u0003J\u0084\u0004\u0010\u009f\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\n2\b\b\u0002\u0010-\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u00020\n2\b\b\u0002\u00100\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00105\u001a\u00020\n2\b\b\u0002\u00106\u001a\u00020\n2\b\b\u0002\u00107\u001a\u00020\nHÆ\u0001J\u0015\u0010 \u0001\u001a\u00020\u00032\t\u0010¡\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010¢\u0001\u001a\u00030£\u0001HÖ\u0001J\n\u0010¤\u0001\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010*\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0011\u0010+\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0011\u0010-\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b>\u0010:R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bA\u0010:R\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010 \u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bE\u0010:R\u0011\u0010\"\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bF\u0010:R\u0011\u0010)\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bG\u0010:R\u0011\u0010\u0018\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bH\u0010:R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010@R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010CR\u0011\u00102\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010CR\u0011\u0010'\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010:R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010@R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bL\u0010:R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bM\u0010:R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bN\u0010:R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bO\u0010:R\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bP\u0010:R\u0011\u0010\u001e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010:R\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bR\u0010:R\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bS\u0010:R\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bT\u0010:R\u0011\u00100\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bU\u0010:R\u0011\u0010.\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bV\u0010:R\u0011\u0010/\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bW\u0010:R\u0011\u00106\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bX\u0010:R\u0011\u00107\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bY\u0010:R\u0011\u00105\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010:R\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010CR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010:R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b]\u0010:R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b^\u0010:R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b_\u0010:R\u0013\u00104\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010@R\u0011\u00103\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010CR\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bb\u0010@R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bc\u0010:R\u0011\u0010,\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bd\u0010:R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u00101\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bg\u0010fR\u0011\u0010%\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bh\u0010:R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bi\u0010fR\u0011\u0010#\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bj\u0010fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bk\u0010fR\u0011\u0010$\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bl\u0010f¨\u0006¥\u0001"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EngineValidationUpdate;", "", "isFloorDataValid", "", "buildingId", "", "x", "", "y", "mx", "", "my", "mz", "u", "td", "calibError", "a0", "q0", "q1", "q2", "q3", "mapVersion", "mapId", "floorId", "f", "t", "osLctnX", "osLctnY", "osLctnZ", "osLctnHU", "osLctnVU", "FormatVersion", "dMx", "dMy", "dMz", "xFreePath", "yFreePath", "velocity", "calibNeeded", "lockProgress", "postFirstLock", "elapsedTime", "application_state", "background_ratio", "time_diff", "barometer", "os_lctn_lat", "os_lctn_lon", "os_lctn_alt", "user_accuracy", "is_smart_cart", "strictMode", "restrictedAreaId", "pdr_class", "pdr_accuracy_x", "pdr_accuracy_y", "(ZLjava/lang/String;FFDDDFDDDDDDDDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;DDDDDDDDDFFDZDZDDDDDDDDFZZLjava/lang/String;DDD)V", "getFormatVersion", "()D", "getA0", "getApplication_state", "getBackground_ratio", "getBarometer", "getBuildingId", "()Ljava/lang/String;", "getCalibError", "getCalibNeeded", "()Z", "getDMx", "getDMy", "getDMz", "getElapsedTime", "getF", "getFloorId", "getLockProgress", "getMapId", "getMapVersion", "getMx", "getMy", "getMz", "getOsLctnHU", "getOsLctnVU", "getOsLctnX", "getOsLctnY", "getOsLctnZ", "getOs_lctn_alt", "getOs_lctn_lat", "getOs_lctn_lon", "getPdr_accuracy_x", "getPdr_accuracy_y", "getPdr_class", "getPostFirstLock", "getQ0", "getQ1", "getQ2", "getQ3", "getRestrictedAreaId", "getStrictMode", "getT", "getTd", "getTime_diff", "getU", "()F", "getUser_accuracy", "getVelocity", "getX", "getXFreePath", "getY", "getYFreePath", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EngineValidationUpdate {
    private final double FormatVersion;
    private final double a0;
    private final double application_state;
    private final double background_ratio;
    private final double barometer;

    @NotNull
    private final String buildingId;
    private final double calibError;
    private final boolean calibNeeded;
    private final double dMx;
    private final double dMy;
    private final double dMz;
    private final double elapsedTime;
    private final double f;

    @Nullable
    private final String floorId;
    private final boolean isFloorDataValid;
    private final boolean is_smart_cart;
    private final double lockProgress;

    @Nullable
    private final String mapId;
    private final double mapVersion;
    private final double mx;
    private final double my;
    private final double mz;
    private final double osLctnHU;
    private final double osLctnVU;
    private final double osLctnX;
    private final double osLctnY;
    private final double osLctnZ;
    private final double os_lctn_alt;
    private final double os_lctn_lat;
    private final double os_lctn_lon;
    private final double pdr_accuracy_x;
    private final double pdr_accuracy_y;
    private final double pdr_class;
    private final boolean postFirstLock;
    private final double q0;
    private final double q1;
    private final double q2;
    private final double q3;

    @Nullable
    private final String restrictedAreaId;
    private final boolean strictMode;

    @NotNull
    private final String t;
    private final double td;
    private final double time_diff;
    private final float u;
    private final float user_accuracy;
    private final double velocity;
    private final float x;
    private final float xFreePath;
    private final float y;
    private final float yFreePath;

    public EngineValidationUpdate(boolean z, @NotNull String buildingId, float f, float f2, double d, double d2, double d3, float f3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, @Nullable String str, @Nullable String str2, double d12, @NotNull String t, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, float f4, float f5, double d22, boolean z2, double d23, boolean z3, double d24, double d25, double d26, double d27, double d28, double d29, double d30, double d31, float f6, boolean z4, boolean z5, @Nullable String str3, double d32, double d33, double d34) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(t, "t");
        this.isFloorDataValid = z;
        this.buildingId = buildingId;
        this.x = f;
        this.y = f2;
        this.mx = d;
        this.my = d2;
        this.mz = d3;
        this.u = f3;
        this.td = d4;
        this.calibError = d5;
        this.a0 = d6;
        this.q0 = d7;
        this.q1 = d8;
        this.q2 = d9;
        this.q3 = d10;
        this.mapVersion = d11;
        this.mapId = str;
        this.floorId = str2;
        this.f = d12;
        this.t = t;
        this.osLctnX = d13;
        this.osLctnY = d14;
        this.osLctnZ = d15;
        this.osLctnHU = d16;
        this.osLctnVU = d17;
        this.FormatVersion = d18;
        this.dMx = d19;
        this.dMy = d20;
        this.dMz = d21;
        this.xFreePath = f4;
        this.yFreePath = f5;
        this.velocity = d22;
        this.calibNeeded = z2;
        this.lockProgress = d23;
        this.postFirstLock = z3;
        this.elapsedTime = d24;
        this.application_state = d25;
        this.background_ratio = d26;
        this.time_diff = d27;
        this.barometer = d28;
        this.os_lctn_lat = d29;
        this.os_lctn_lon = d30;
        this.os_lctn_alt = d31;
        this.user_accuracy = f6;
        this.is_smart_cart = z4;
        this.strictMode = z5;
        this.restrictedAreaId = str3;
        this.pdr_class = d32;
        this.pdr_accuracy_x = d33;
        this.pdr_accuracy_y = d34;
    }

    public static /* synthetic */ EngineValidationUpdate copy$default(EngineValidationUpdate engineValidationUpdate, boolean z, String str, float f, float f2, double d, double d2, double d3, float f3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, String str2, String str3, double d12, String str4, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, float f4, float f5, double d22, boolean z2, double d23, boolean z3, double d24, double d25, double d26, double d27, double d28, double d29, double d30, double d31, float f6, boolean z4, boolean z5, String str5, double d32, double d33, double d34, int i, int i2, Object obj) {
        double d35;
        double d36;
        double d37;
        double d38;
        double d39;
        float f7;
        boolean z6;
        boolean z7;
        String str6;
        double d40;
        double d41;
        boolean z8;
        double d42;
        double d43;
        double d44;
        double d45;
        boolean z9;
        double d46;
        double d47;
        double d48;
        double d49;
        float f8;
        double d50;
        float f9;
        double d51;
        boolean z10 = (i & 1) != 0 ? engineValidationUpdate.isFloorDataValid : z;
        String str7 = (i & 2) != 0 ? engineValidationUpdate.buildingId : str;
        float f10 = (i & 4) != 0 ? engineValidationUpdate.x : f;
        float f11 = (i & 8) != 0 ? engineValidationUpdate.y : f2;
        double d52 = (i & 16) != 0 ? engineValidationUpdate.mx : d;
        double d53 = (i & 32) != 0 ? engineValidationUpdate.my : d2;
        double d54 = (i & 64) != 0 ? engineValidationUpdate.mz : d3;
        float f12 = (i & 128) != 0 ? engineValidationUpdate.u : f3;
        double d55 = (i & 256) != 0 ? engineValidationUpdate.td : d4;
        boolean z11 = z10;
        String str8 = str7;
        double d56 = (i & 512) != 0 ? engineValidationUpdate.calibError : d5;
        double d57 = (i & 1024) != 0 ? engineValidationUpdate.a0 : d6;
        double d58 = (i & 2048) != 0 ? engineValidationUpdate.q0 : d7;
        double d59 = (i & 4096) != 0 ? engineValidationUpdate.q1 : d8;
        double d60 = (i & 8192) != 0 ? engineValidationUpdate.q2 : d9;
        double d61 = (i & 16384) != 0 ? engineValidationUpdate.q3 : d10;
        double d62 = (i & 32768) != 0 ? engineValidationUpdate.mapVersion : d11;
        String str9 = (i & 65536) != 0 ? engineValidationUpdate.mapId : str2;
        String str10 = (i & 131072) != 0 ? engineValidationUpdate.floorId : str3;
        double d63 = d62;
        double d64 = (i & 262144) != 0 ? engineValidationUpdate.f : d12;
        String str11 = str10;
        String str12 = (i & 524288) != 0 ? engineValidationUpdate.t : str4;
        double d65 = d64;
        double d66 = (i & 1048576) != 0 ? engineValidationUpdate.osLctnX : d13;
        double d67 = (i & 2097152) != 0 ? engineValidationUpdate.osLctnY : d14;
        double d68 = (i & 4194304) != 0 ? engineValidationUpdate.osLctnZ : d15;
        double d69 = (i & 8388608) != 0 ? engineValidationUpdate.osLctnHU : d16;
        double d70 = (i & 16777216) != 0 ? engineValidationUpdate.osLctnVU : d17;
        double d71 = (i & 33554432) != 0 ? engineValidationUpdate.FormatVersion : d18;
        double d72 = (i & 67108864) != 0 ? engineValidationUpdate.dMx : d19;
        double d73 = (i & 134217728) != 0 ? engineValidationUpdate.dMy : d20;
        double d74 = (i & 268435456) != 0 ? engineValidationUpdate.dMz : d21;
        String str13 = str12;
        float f13 = (i & 536870912) != 0 ? engineValidationUpdate.xFreePath : f4;
        float f14 = (i & 1073741824) != 0 ? engineValidationUpdate.yFreePath : f5;
        double d75 = d74;
        double d76 = (i & Integer.MIN_VALUE) != 0 ? engineValidationUpdate.velocity : d22;
        float f15 = f14;
        boolean z12 = (i2 & 1) != 0 ? engineValidationUpdate.calibNeeded : z2;
        double d77 = d76;
        double d78 = (i2 & 2) != 0 ? engineValidationUpdate.lockProgress : d23;
        boolean z13 = z12;
        boolean z14 = (i2 & 4) != 0 ? engineValidationUpdate.postFirstLock : z3;
        double d79 = d78;
        double d80 = (i2 & 8) != 0 ? engineValidationUpdate.elapsedTime : d24;
        double d81 = (i2 & 16) != 0 ? engineValidationUpdate.application_state : d25;
        double d82 = (i2 & 32) != 0 ? engineValidationUpdate.background_ratio : d26;
        boolean z15 = z14;
        double d83 = (i2 & 64) != 0 ? engineValidationUpdate.time_diff : d27;
        double d84 = (i2 & 128) != 0 ? engineValidationUpdate.barometer : d28;
        double d85 = (i2 & 256) != 0 ? engineValidationUpdate.os_lctn_lat : d29;
        double d86 = (i2 & 512) != 0 ? engineValidationUpdate.os_lctn_lon : d30;
        double d87 = (i2 & 1024) != 0 ? engineValidationUpdate.os_lctn_alt : d31;
        float f16 = (i2 & 2048) != 0 ? engineValidationUpdate.user_accuracy : f6;
        boolean z16 = (i2 & 4096) != 0 ? engineValidationUpdate.is_smart_cart : z4;
        boolean z17 = (i2 & 8192) != 0 ? engineValidationUpdate.strictMode : z5;
        String str14 = (i2 & 16384) != 0 ? engineValidationUpdate.restrictedAreaId : str5;
        double d88 = (i2 & 32768) != 0 ? engineValidationUpdate.pdr_class : d32;
        double d89 = (i2 & 65536) != 0 ? engineValidationUpdate.pdr_accuracy_x : d33;
        if ((i2 & 131072) != 0) {
            d36 = d89;
            d35 = engineValidationUpdate.pdr_accuracy_y;
            d38 = d85;
            d39 = d86;
            f7 = f16;
            z6 = z16;
            z7 = z17;
            str6 = str14;
            d40 = d88;
            d41 = d87;
            d42 = d79;
            d43 = d80;
            d44 = d81;
            d45 = d82;
            z9 = z15;
            d46 = d83;
            d37 = d84;
            d47 = d71;
            d48 = d72;
            d49 = d73;
            f8 = f13;
            d50 = d75;
            f9 = f15;
            d51 = d77;
            z8 = z13;
        } else {
            d35 = d34;
            d36 = d89;
            d37 = d84;
            d38 = d85;
            d39 = d86;
            f7 = f16;
            z6 = z16;
            z7 = z17;
            str6 = str14;
            d40 = d88;
            d41 = d87;
            z8 = z13;
            d42 = d79;
            d43 = d80;
            d44 = d81;
            d45 = d82;
            z9 = z15;
            d46 = d83;
            d47 = d71;
            d48 = d72;
            d49 = d73;
            f8 = f13;
            d50 = d75;
            f9 = f15;
            d51 = d77;
        }
        return engineValidationUpdate.copy(z11, str8, f10, f11, d52, d53, d54, f12, d55, d56, d57, d58, d59, d60, d61, d63, str9, str11, d65, str13, d66, d67, d68, d69, d70, d47, d48, d49, d50, f8, f9, d51, z8, d42, z9, d43, d44, d45, d46, d37, d38, d39, d41, f7, z6, z7, str6, d40, d36, d35);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFloorDataValid() {
        return this.isFloorDataValid;
    }

    /* renamed from: component10, reason: from getter */
    public final double getCalibError() {
        return this.calibError;
    }

    /* renamed from: component11, reason: from getter */
    public final double getA0() {
        return this.a0;
    }

    /* renamed from: component12, reason: from getter */
    public final double getQ0() {
        return this.q0;
    }

    /* renamed from: component13, reason: from getter */
    public final double getQ1() {
        return this.q1;
    }

    /* renamed from: component14, reason: from getter */
    public final double getQ2() {
        return this.q2;
    }

    /* renamed from: component15, reason: from getter */
    public final double getQ3() {
        return this.q3;
    }

    /* renamed from: component16, reason: from getter */
    public final double getMapVersion() {
        return this.mapVersion;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    /* renamed from: component19, reason: from getter */
    public final double getF() {
        return this.f;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final String getT() {
        return this.t;
    }

    /* renamed from: component21, reason: from getter */
    public final double getOsLctnX() {
        return this.osLctnX;
    }

    /* renamed from: component22, reason: from getter */
    public final double getOsLctnY() {
        return this.osLctnY;
    }

    /* renamed from: component23, reason: from getter */
    public final double getOsLctnZ() {
        return this.osLctnZ;
    }

    /* renamed from: component24, reason: from getter */
    public final double getOsLctnHU() {
        return this.osLctnHU;
    }

    /* renamed from: component25, reason: from getter */
    public final double getOsLctnVU() {
        return this.osLctnVU;
    }

    /* renamed from: component26, reason: from getter */
    public final double getFormatVersion() {
        return this.FormatVersion;
    }

    /* renamed from: component27, reason: from getter */
    public final double getDMx() {
        return this.dMx;
    }

    /* renamed from: component28, reason: from getter */
    public final double getDMy() {
        return this.dMy;
    }

    /* renamed from: component29, reason: from getter */
    public final double getDMz() {
        return this.dMz;
    }

    /* renamed from: component3, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component30, reason: from getter */
    public final float getXFreePath() {
        return this.xFreePath;
    }

    /* renamed from: component31, reason: from getter */
    public final float getYFreePath() {
        return this.yFreePath;
    }

    /* renamed from: component32, reason: from getter */
    public final double getVelocity() {
        return this.velocity;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getCalibNeeded() {
        return this.calibNeeded;
    }

    /* renamed from: component34, reason: from getter */
    public final double getLockProgress() {
        return this.lockProgress;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getPostFirstLock() {
        return this.postFirstLock;
    }

    /* renamed from: component36, reason: from getter */
    public final double getElapsedTime() {
        return this.elapsedTime;
    }

    /* renamed from: component37, reason: from getter */
    public final double getApplication_state() {
        return this.application_state;
    }

    /* renamed from: component38, reason: from getter */
    public final double getBackground_ratio() {
        return this.background_ratio;
    }

    /* renamed from: component39, reason: from getter */
    public final double getTime_diff() {
        return this.time_diff;
    }

    /* renamed from: component4, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component40, reason: from getter */
    public final double getBarometer() {
        return this.barometer;
    }

    /* renamed from: component41, reason: from getter */
    public final double getOs_lctn_lat() {
        return this.os_lctn_lat;
    }

    /* renamed from: component42, reason: from getter */
    public final double getOs_lctn_lon() {
        return this.os_lctn_lon;
    }

    /* renamed from: component43, reason: from getter */
    public final double getOs_lctn_alt() {
        return this.os_lctn_alt;
    }

    /* renamed from: component44, reason: from getter */
    public final float getUser_accuracy() {
        return this.user_accuracy;
    }

    /* renamed from: component45, reason: from getter */
    public final boolean getIs_smart_cart() {
        return this.is_smart_cart;
    }

    /* renamed from: component46, reason: from getter */
    public final boolean getStrictMode() {
        return this.strictMode;
    }

    @Nullable
    /* renamed from: component47, reason: from getter */
    public final String getRestrictedAreaId() {
        return this.restrictedAreaId;
    }

    /* renamed from: component48, reason: from getter */
    public final double getPdr_class() {
        return this.pdr_class;
    }

    /* renamed from: component49, reason: from getter */
    public final double getPdr_accuracy_x() {
        return this.pdr_accuracy_x;
    }

    /* renamed from: component5, reason: from getter */
    public final double getMx() {
        return this.mx;
    }

    /* renamed from: component50, reason: from getter */
    public final double getPdr_accuracy_y() {
        return this.pdr_accuracy_y;
    }

    /* renamed from: component6, reason: from getter */
    public final double getMy() {
        return this.my;
    }

    /* renamed from: component7, reason: from getter */
    public final double getMz() {
        return this.mz;
    }

    /* renamed from: component8, reason: from getter */
    public final float getU() {
        return this.u;
    }

    /* renamed from: component9, reason: from getter */
    public final double getTd() {
        return this.td;
    }

    @NotNull
    public final EngineValidationUpdate copy(boolean isFloorDataValid, @NotNull String buildingId, float x, float y, double mx, double my, double mz, float u, double td, double calibError, double a0, double q0, double q1, double q2, double q3, double mapVersion, @Nullable String mapId, @Nullable String floorId, double f, @NotNull String t, double osLctnX, double osLctnY, double osLctnZ, double osLctnHU, double osLctnVU, double FormatVersion, double dMx, double dMy, double dMz, float xFreePath, float yFreePath, double velocity, boolean calibNeeded, double lockProgress, boolean postFirstLock, double elapsedTime, double application_state, double background_ratio, double time_diff, double barometer, double os_lctn_lat, double os_lctn_lon, double os_lctn_alt, float user_accuracy, boolean is_smart_cart, boolean strictMode, @Nullable String restrictedAreaId, double pdr_class, double pdr_accuracy_x, double pdr_accuracy_y) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(t, "t");
        return new EngineValidationUpdate(isFloorDataValid, buildingId, x, y, mx, my, mz, u, td, calibError, a0, q0, q1, q2, q3, mapVersion, mapId, floorId, f, t, osLctnX, osLctnY, osLctnZ, osLctnHU, osLctnVU, FormatVersion, dMx, dMy, dMz, xFreePath, yFreePath, velocity, calibNeeded, lockProgress, postFirstLock, elapsedTime, application_state, background_ratio, time_diff, barometer, os_lctn_lat, os_lctn_lon, os_lctn_alt, user_accuracy, is_smart_cart, strictMode, restrictedAreaId, pdr_class, pdr_accuracy_x, pdr_accuracy_y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineValidationUpdate)) {
            return false;
        }
        EngineValidationUpdate engineValidationUpdate = (EngineValidationUpdate) other;
        return this.isFloorDataValid == engineValidationUpdate.isFloorDataValid && Intrinsics.c(this.buildingId, engineValidationUpdate.buildingId) && Float.compare(this.x, engineValidationUpdate.x) == 0 && Float.compare(this.y, engineValidationUpdate.y) == 0 && Double.compare(this.mx, engineValidationUpdate.mx) == 0 && Double.compare(this.my, engineValidationUpdate.my) == 0 && Double.compare(this.mz, engineValidationUpdate.mz) == 0 && Float.compare(this.u, engineValidationUpdate.u) == 0 && Double.compare(this.td, engineValidationUpdate.td) == 0 && Double.compare(this.calibError, engineValidationUpdate.calibError) == 0 && Double.compare(this.a0, engineValidationUpdate.a0) == 0 && Double.compare(this.q0, engineValidationUpdate.q0) == 0 && Double.compare(this.q1, engineValidationUpdate.q1) == 0 && Double.compare(this.q2, engineValidationUpdate.q2) == 0 && Double.compare(this.q3, engineValidationUpdate.q3) == 0 && Double.compare(this.mapVersion, engineValidationUpdate.mapVersion) == 0 && Intrinsics.c(this.mapId, engineValidationUpdate.mapId) && Intrinsics.c(this.floorId, engineValidationUpdate.floorId) && Double.compare(this.f, engineValidationUpdate.f) == 0 && Intrinsics.c(this.t, engineValidationUpdate.t) && Double.compare(this.osLctnX, engineValidationUpdate.osLctnX) == 0 && Double.compare(this.osLctnY, engineValidationUpdate.osLctnY) == 0 && Double.compare(this.osLctnZ, engineValidationUpdate.osLctnZ) == 0 && Double.compare(this.osLctnHU, engineValidationUpdate.osLctnHU) == 0 && Double.compare(this.osLctnVU, engineValidationUpdate.osLctnVU) == 0 && Double.compare(this.FormatVersion, engineValidationUpdate.FormatVersion) == 0 && Double.compare(this.dMx, engineValidationUpdate.dMx) == 0 && Double.compare(this.dMy, engineValidationUpdate.dMy) == 0 && Double.compare(this.dMz, engineValidationUpdate.dMz) == 0 && Float.compare(this.xFreePath, engineValidationUpdate.xFreePath) == 0 && Float.compare(this.yFreePath, engineValidationUpdate.yFreePath) == 0 && Double.compare(this.velocity, engineValidationUpdate.velocity) == 0 && this.calibNeeded == engineValidationUpdate.calibNeeded && Double.compare(this.lockProgress, engineValidationUpdate.lockProgress) == 0 && this.postFirstLock == engineValidationUpdate.postFirstLock && Double.compare(this.elapsedTime, engineValidationUpdate.elapsedTime) == 0 && Double.compare(this.application_state, engineValidationUpdate.application_state) == 0 && Double.compare(this.background_ratio, engineValidationUpdate.background_ratio) == 0 && Double.compare(this.time_diff, engineValidationUpdate.time_diff) == 0 && Double.compare(this.barometer, engineValidationUpdate.barometer) == 0 && Double.compare(this.os_lctn_lat, engineValidationUpdate.os_lctn_lat) == 0 && Double.compare(this.os_lctn_lon, engineValidationUpdate.os_lctn_lon) == 0 && Double.compare(this.os_lctn_alt, engineValidationUpdate.os_lctn_alt) == 0 && Float.compare(this.user_accuracy, engineValidationUpdate.user_accuracy) == 0 && this.is_smart_cart == engineValidationUpdate.is_smart_cart && this.strictMode == engineValidationUpdate.strictMode && Intrinsics.c(this.restrictedAreaId, engineValidationUpdate.restrictedAreaId) && Double.compare(this.pdr_class, engineValidationUpdate.pdr_class) == 0 && Double.compare(this.pdr_accuracy_x, engineValidationUpdate.pdr_accuracy_x) == 0 && Double.compare(this.pdr_accuracy_y, engineValidationUpdate.pdr_accuracy_y) == 0;
    }

    public final double getA0() {
        return this.a0;
    }

    public final double getApplication_state() {
        return this.application_state;
    }

    public final double getBackground_ratio() {
        return this.background_ratio;
    }

    public final double getBarometer() {
        return this.barometer;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final double getCalibError() {
        return this.calibError;
    }

    public final boolean getCalibNeeded() {
        return this.calibNeeded;
    }

    public final double getDMx() {
        return this.dMx;
    }

    public final double getDMy() {
        return this.dMy;
    }

    public final double getDMz() {
        return this.dMz;
    }

    public final double getElapsedTime() {
        return this.elapsedTime;
    }

    public final double getF() {
        return this.f;
    }

    @Nullable
    public final String getFloorId() {
        return this.floorId;
    }

    public final double getFormatVersion() {
        return this.FormatVersion;
    }

    public final double getLockProgress() {
        return this.lockProgress;
    }

    @Nullable
    public final String getMapId() {
        return this.mapId;
    }

    public final double getMapVersion() {
        return this.mapVersion;
    }

    public final double getMx() {
        return this.mx;
    }

    public final double getMy() {
        return this.my;
    }

    public final double getMz() {
        return this.mz;
    }

    public final double getOsLctnHU() {
        return this.osLctnHU;
    }

    public final double getOsLctnVU() {
        return this.osLctnVU;
    }

    public final double getOsLctnX() {
        return this.osLctnX;
    }

    public final double getOsLctnY() {
        return this.osLctnY;
    }

    public final double getOsLctnZ() {
        return this.osLctnZ;
    }

    public final double getOs_lctn_alt() {
        return this.os_lctn_alt;
    }

    public final double getOs_lctn_lat() {
        return this.os_lctn_lat;
    }

    public final double getOs_lctn_lon() {
        return this.os_lctn_lon;
    }

    public final double getPdr_accuracy_x() {
        return this.pdr_accuracy_x;
    }

    public final double getPdr_accuracy_y() {
        return this.pdr_accuracy_y;
    }

    public final double getPdr_class() {
        return this.pdr_class;
    }

    public final boolean getPostFirstLock() {
        return this.postFirstLock;
    }

    public final double getQ0() {
        return this.q0;
    }

    public final double getQ1() {
        return this.q1;
    }

    public final double getQ2() {
        return this.q2;
    }

    public final double getQ3() {
        return this.q3;
    }

    @Nullable
    public final String getRestrictedAreaId() {
        return this.restrictedAreaId;
    }

    public final boolean getStrictMode() {
        return this.strictMode;
    }

    @NotNull
    public final String getT() {
        return this.t;
    }

    public final double getTd() {
        return this.td;
    }

    public final double getTime_diff() {
        return this.time_diff;
    }

    public final float getU() {
        return this.u;
    }

    public final float getUser_accuracy() {
        return this.user_accuracy;
    }

    public final double getVelocity() {
        return this.velocity;
    }

    public final float getX() {
        return this.x;
    }

    public final float getXFreePath() {
        return this.xFreePath;
    }

    public final float getY() {
        return this.y;
    }

    public final float getYFreePath() {
        return this.yFreePath;
    }

    public int hashCode() {
        int iA = v.a(this.mapVersion, v.a(this.q3, v.a(this.q2, v.a(this.q1, v.a(this.q0, v.a(this.a0, v.a(this.calibError, v.a(this.td, android.support.v4.media.session.a.b(this.u, v.a(this.mz, v.a(this.my, v.a(this.mx, android.support.v4.media.session.a.b(this.y, android.support.v4.media.session.a.b(this.x, z.a(this.buildingId, Boolean.hashCode(this.isFloorDataValid) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.mapId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.floorId;
        int iA2 = x.a(this.strictMode, x.a(this.is_smart_cart, android.support.v4.media.session.a.b(this.user_accuracy, v.a(this.os_lctn_alt, v.a(this.os_lctn_lon, v.a(this.os_lctn_lat, v.a(this.barometer, v.a(this.time_diff, v.a(this.background_ratio, v.a(this.application_state, v.a(this.elapsedTime, x.a(this.postFirstLock, v.a(this.lockProgress, x.a(this.calibNeeded, v.a(this.velocity, android.support.v4.media.session.a.b(this.yFreePath, android.support.v4.media.session.a.b(this.xFreePath, v.a(this.dMz, v.a(this.dMy, v.a(this.dMx, v.a(this.FormatVersion, v.a(this.osLctnVU, v.a(this.osLctnHU, v.a(this.osLctnZ, v.a(this.osLctnY, v.a(this.osLctnX, z.a(this.t, v.a(this.f, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str3 = this.restrictedAreaId;
        return Double.hashCode(this.pdr_accuracy_y) + v.a(this.pdr_accuracy_x, v.a(this.pdr_class, (iA2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31);
    }

    public final boolean isFloorDataValid() {
        return this.isFloorDataValid;
    }

    public final boolean is_smart_cart() {
        return this.is_smart_cart;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EngineValidationUpdate(isFloorDataValid=");
        sb.append(this.isFloorDataValid);
        sb.append(", buildingId=");
        sb.append(this.buildingId);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", mx=");
        sb.append(this.mx);
        sb.append(", my=");
        sb.append(this.my);
        sb.append(", mz=");
        sb.append(this.mz);
        sb.append(", u=");
        sb.append(this.u);
        sb.append(", td=");
        sb.append(this.td);
        sb.append(", calibError=");
        sb.append(this.calibError);
        sb.append(", a0=");
        sb.append(this.a0);
        sb.append(", q0=");
        sb.append(this.q0);
        sb.append(", q1=");
        sb.append(this.q1);
        sb.append(", q2=");
        sb.append(this.q2);
        sb.append(", q3=");
        sb.append(this.q3);
        sb.append(", mapVersion=");
        sb.append(this.mapVersion);
        sb.append(", mapId=");
        sb.append(this.mapId);
        sb.append(", floorId=");
        sb.append(this.floorId);
        sb.append(", f=");
        sb.append(this.f);
        sb.append(", t=");
        sb.append(this.t);
        sb.append(", osLctnX=");
        sb.append(this.osLctnX);
        sb.append(", osLctnY=");
        sb.append(this.osLctnY);
        sb.append(", osLctnZ=");
        sb.append(this.osLctnZ);
        sb.append(", osLctnHU=");
        sb.append(this.osLctnHU);
        sb.append(", osLctnVU=");
        sb.append(this.osLctnVU);
        sb.append(", FormatVersion=");
        sb.append(this.FormatVersion);
        sb.append(", dMx=");
        sb.append(this.dMx);
        sb.append(", dMy=");
        sb.append(this.dMy);
        sb.append(", dMz=");
        sb.append(this.dMz);
        sb.append(", xFreePath=");
        sb.append(this.xFreePath);
        sb.append(", yFreePath=");
        sb.append(this.yFreePath);
        sb.append(", velocity=");
        sb.append(this.velocity);
        sb.append(", calibNeeded=");
        sb.append(this.calibNeeded);
        sb.append(", lockProgress=");
        sb.append(this.lockProgress);
        sb.append(", postFirstLock=");
        sb.append(this.postFirstLock);
        sb.append(", elapsedTime=");
        sb.append(this.elapsedTime);
        sb.append(", application_state=");
        sb.append(this.application_state);
        sb.append(", background_ratio=");
        sb.append(this.background_ratio);
        sb.append(", time_diff=");
        sb.append(this.time_diff);
        sb.append(", barometer=");
        sb.append(this.barometer);
        sb.append(", os_lctn_lat=");
        sb.append(this.os_lctn_lat);
        sb.append(", os_lctn_lon=");
        sb.append(this.os_lctn_lon);
        sb.append(", os_lctn_alt=");
        sb.append(this.os_lctn_alt);
        sb.append(", user_accuracy=");
        sb.append(this.user_accuracy);
        sb.append(", is_smart_cart=");
        sb.append(this.is_smart_cart);
        sb.append(", strictMode=");
        sb.append(this.strictMode);
        sb.append(", restrictedAreaId=");
        sb.append(this.restrictedAreaId);
        sb.append(", pdr_class=");
        sb.append(this.pdr_class);
        sb.append(", pdr_accuracy_x=");
        sb.append(this.pdr_accuracy_x);
        sb.append(", pdr_accuracy_y=");
        return androidx.camera.core.impl.b.p(sb, this.pdr_accuracy_y, ')');
    }
}
