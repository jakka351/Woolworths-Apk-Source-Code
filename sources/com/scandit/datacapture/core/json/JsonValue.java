package com.scandit.datacapture.core.json;

import androidx.annotation.ColorInt;
import com.salesforce.marketingcloud.storage.db.i;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0014j\b\u0012\u0004\u0012\u00020\u0003`\u0015H\u0097\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u0097\u0001J!\u0010\u0017\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0014j\b\u0012\u0004\u0012\u00020\u0003`\u0015H\u0097\u0001J\t\u0010\u001a\u001a\u00020\u0000H\u0097\u0001J\t\u0010\u001b\u001a\u00020\u0010H\u0097\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u0097\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u0097\u0001J\t\u0010 \u001a\u00020!H\u0097\u0001J\t\u0010\"\u001a\u00020#H\u0097\u0001J\t\u0010$\u001a\u00020\u001fH\u0097\u0001J\t\u0010%\u001a\u00020&H\u0097\u0001J\t\u0010'\u001a\u00020\u0000H\u0097\u0001J\t\u0010(\u001a\u00020)H\u0097\u0001J\t\u0010*\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0003H\u0097\u0003J\u001d\u0010-\u001a\u0004\u0018\u00010\u00002\u0006\u0010,\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0000H\u0097\u0001J\u0019\u0010/\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0010H\u0097\u0001J\u0019\u00100\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001dH\u0097\u0001J\u0019\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001fH\u0097\u0001J\u0019\u00102\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020!H\u0097\u0001J\u0019\u00103\u001a\u00020#2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020#H\u0097\u0001J\u0019\u00104\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001fH\u0097\u0001J\u0019\u00105\u001a\u00020&2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020&H\u0097\u0001J!\u00106\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0002\b7J\u001d\u00108\u001a\u0004\u0018\u00010\u00002\u0006\u0010,\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0000H\u0097\u0001J\u0019\u00109\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020)H\u0097\u0001J\u0019\u0010:\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0003H\u0097\u0001J\t\u0010;\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u001fH\u0097\u0001J\u0011\u0010>\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010?\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010@\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010A\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010B\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010C\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010D\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010E\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010F\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010G\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010H\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010I\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003H\u0097\u0001R\u0014\u0010\b\u001a\u00020\u00038WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006J"}, d2 = {"Lcom/scandit/datacapture/core/json/JsonValue;", "Lcom/scandit/datacapture/core/json/JsonValueProxy;", "jsonData", "", "(Ljava/lang/String;)V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "(Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "absolutePath", "getAbsolutePath", "()Ljava/lang/String;", "size", "", "getSize", "()J", "used", "", "getUsed", "()Z", "_getWarnings", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "_impl", "_removeKeys", "", i.a.n, "asArray", "asBoolean", "asBrush", "Lcom/scandit/datacapture/core/ui/style/Brush;", "asColor", "", "asFloat", "", "asFloatWithUnit", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "asInt", "asMarginsWithUnit", "Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "asObject", "asPointWithUnit", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "asString", "contains", "key", "getByKeyAsArray", "defaultValue", "getByKeyAsBoolean", "getByKeyAsBrush", "getByKeyAsColor", "getByKeyAsFloat", "getByKeyAsFloatWithUnit", "getByKeyAsInt", "getByKeyAsMarginsWithUnit", "getByKeyAsNullableString", "getByKeyAsNullableString$scandit_capture_core", "getByKeyAsObject", "getByKeyAsPointWithUnit", "getByKeyAsString", "jsonString", "requireByIndex", "index", "requireByKey", "requireByKeyAsArray", "requireByKeyAsBoolean", "requireByKeyAsBrush", "requireByKeyAsColor", "requireByKeyAsFloat", "requireByKeyAsFloatWithUnit", "requireByKeyAsInt", "requireByKeyAsMarginsWithUnit", "requireByKeyAsObject", "requireByKeyAsPointWithUnit", "requireByKeyAsString", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class JsonValue implements JsonValueProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ JsonValueProxyAdapter f18777a;

    public JsonValue(@NotNull NativeJsonValue impl) {
        Intrinsics.h(impl, "impl");
        this.f18777a = new JsonValueProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getWarnings")
    @NotNull
    public ArrayList<String> _getWarnings() {
        return this.f18777a._getWarnings();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeJsonValue getF18778a() {
        return this.f18777a.getF18778a();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "removeKeys")
    public void _removeKeys(@NotNull ArrayList<String> keys) {
        Intrinsics.h(keys, "keys");
        this.f18777a._removeKeys(keys);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    @NotNull
    public JsonValue asArray() {
        return this.f18777a.asArray();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "asBool")
    public boolean asBoolean() {
        return this.f18777a.asBoolean();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    @NotNull
    public Brush asBrush() {
        return this.f18777a.asBrush();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ColorInt
    @ProxyFunction
    public int asColor() {
        return this.f18777a.asColor();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public float asFloat() {
        return this.f18777a.asFloat();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    @NotNull
    public FloatWithUnit asFloatWithUnit() {
        return this.f18777a.asFloatWithUnit();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public int asInt() {
        return this.f18777a.asInt();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    @NotNull
    public MarginsWithUnit asMarginsWithUnit() {
        return this.f18777a.asMarginsWithUnit();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    @NotNull
    public JsonValue asObject() {
        return this.f18777a.asObject();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    @NotNull
    public PointWithUnit asPointWithUnit() {
        return this.f18777a.asPointWithUnit();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    @NotNull
    public String asString() {
        return this.f18777a.asString();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction
    public boolean contains(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.contains(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(property = "absolutePath")
    @NotNull
    public String getAbsolutePath() {
        return this.f18777a.getAbsolutePath();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getArrayForKeyOrDefault")
    @Nullable
    public JsonValue getByKeyAsArray(@NotNull String key, @Nullable JsonValue defaultValue) {
        Intrinsics.h(key, "key");
        return this.f18777a.getByKeyAsArray(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getBoolForKeyOrDefault")
    public boolean getByKeyAsBoolean(@NotNull String key, boolean defaultValue) {
        Intrinsics.h(key, "key");
        return this.f18777a.getByKeyAsBoolean(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getBrushForKeyOrDefault")
    @NotNull
    public Brush getByKeyAsBrush(@NotNull String key, @NotNull Brush defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        return this.f18777a.getByKeyAsBrush(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ColorInt
    @ProxyFunction(nativeName = "getColorForKeyOrDefault")
    public int getByKeyAsColor(@NotNull String key, int defaultValue) {
        Intrinsics.h(key, "key");
        return this.f18777a.getByKeyAsColor(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getFloatForKeyOrDefault")
    public float getByKeyAsFloat(@NotNull String key, float defaultValue) {
        Intrinsics.h(key, "key");
        return this.f18777a.getByKeyAsFloat(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getFloatWithUnitForKeyOrDefault")
    @NotNull
    public FloatWithUnit getByKeyAsFloatWithUnit(@NotNull String key, @NotNull FloatWithUnit defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        return this.f18777a.getByKeyAsFloatWithUnit(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getIntForKeyOrDefault")
    public int getByKeyAsInt(@NotNull String key, int defaultValue) {
        Intrinsics.h(key, "key");
        return this.f18777a.getByKeyAsInt(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getMarginsWithUnitForKeyOrDefault")
    @NotNull
    public MarginsWithUnit getByKeyAsMarginsWithUnit(@NotNull String key, @NotNull MarginsWithUnit defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        return this.f18777a.getByKeyAsMarginsWithUnit(key, defaultValue);
    }

    @Nullable
    public final String getByKeyAsNullableString$scandit_capture_core(@NotNull String key, @Nullable String defaultValue) {
        Intrinsics.h(key, "key");
        return getF18778a().getOptionalStringForKeyOrDefault(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getObjectForKeyOrDefault")
    @Nullable
    public JsonValue getByKeyAsObject(@NotNull String key, @Nullable JsonValue defaultValue) {
        Intrinsics.h(key, "key");
        return this.f18777a.getByKeyAsObject(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getPointWithUnitForKeyOrDefault")
    @NotNull
    public PointWithUnit getByKeyAsPointWithUnit(@NotNull String key, @NotNull PointWithUnit defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        return this.f18777a.getByKeyAsPointWithUnit(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getStringForKeyOrDefault")
    @NotNull
    public String getByKeyAsString(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        return this.f18777a.getByKeyAsString(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "size", property = "size")
    public long getSize() {
        return this.f18777a.getSize();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "isUsed", property = "used")
    public boolean getUsed() {
        return this.f18777a.getUsed();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "toString")
    @NotNull
    public String jsonString() {
        return this.f18777a.jsonString();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getForIndex")
    @NotNull
    public JsonValue requireByIndex(int index) {
        return this.f18777a.requireByIndex(index);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getForKey")
    @NotNull
    public JsonValue requireByKey(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKey(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getArrayForKey")
    @NotNull
    public JsonValue requireByKeyAsArray(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsArray(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getBoolForKey")
    public boolean requireByKeyAsBoolean(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsBoolean(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getBrushForKey")
    @NotNull
    public Brush requireByKeyAsBrush(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsBrush(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ColorInt
    @ProxyFunction(nativeName = "getColorForKey")
    public int requireByKeyAsColor(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsColor(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getFloatForKey")
    public float requireByKeyAsFloat(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsFloat(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getFloatWithUnitForKey")
    @NotNull
    public FloatWithUnit requireByKeyAsFloatWithUnit(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsFloatWithUnit(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getIntForKey")
    public int requireByKeyAsInt(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsInt(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getMarginsWithUnitForKey")
    @NotNull
    public MarginsWithUnit requireByKeyAsMarginsWithUnit(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsMarginsWithUnit(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getObjectForKey")
    @NotNull
    public JsonValue requireByKeyAsObject(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsObject(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getPointWithUnitForKey")
    @NotNull
    public PointWithUnit requireByKeyAsPointWithUnit(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsPointWithUnit(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @ProxyFunction(nativeName = "getStringForKey")
    @NotNull
    public String requireByKeyAsString(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18777a.requireByKeyAsString(key);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JsonValue(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        NativeJsonValue nativeJsonValueFromString = NativeJsonValue.fromString(jsonData);
        Intrinsics.g(nativeJsonValueFromString, "fromString(jsonData)");
        this(nativeJsonValueFromString);
    }
}
