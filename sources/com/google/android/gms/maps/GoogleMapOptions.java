package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapColorScheme;

@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzac();
    private static final Integer zza = Integer.valueOf(Color.argb(255, 236, 233, 225));

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean zzb;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean zzc;

    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition zze;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean zzf;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean zzg;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzh;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzi;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean zzj;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean zzk;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean zzl;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean zzm;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean zzn;

    @Nullable
    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float zzo;

    @Nullable
    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float zzp;

    @Nullable
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds zzq;

    @Nullable
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", id = 19, type = "byte")
    private Boolean zzr;

    @Nullable
    @ColorInt
    @SafeParcelable.Field(getter = "getBackgroundColor", id = 20)
    private Integer zzs;

    @Nullable
    @SafeParcelable.Field(getter = "getMapId", id = 21)
    private String zzt;

    @MapColorScheme
    @SafeParcelable.Field(defaultValue = "0", getter = "getMapColorScheme", id = 23, type = "int")
    private int zzu;

    public GoogleMapOptions() {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
    }

    @Nullable
    public static GoogleMapOptions createFromAttributes(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = R.styleable.MapAttrs_mapType;
        if (typedArrayObtainAttributes.hasValue(i)) {
            googleMapOptions.mapType(typedArrayObtainAttributes.getInt(i, -1));
        }
        int i2 = R.styleable.MapAttrs_zOrderOnTop;
        if (typedArrayObtainAttributes.hasValue(i2)) {
            googleMapOptions.zOrderOnTop(typedArrayObtainAttributes.getBoolean(i2, false));
        }
        int i3 = R.styleable.MapAttrs_useViewLifecycle;
        if (typedArrayObtainAttributes.hasValue(i3)) {
            googleMapOptions.useViewLifecycleInFragment(typedArrayObtainAttributes.getBoolean(i3, false));
        }
        int i4 = R.styleable.MapAttrs_uiCompass;
        if (typedArrayObtainAttributes.hasValue(i4)) {
            googleMapOptions.compassEnabled(typedArrayObtainAttributes.getBoolean(i4, true));
        }
        int i5 = R.styleable.MapAttrs_uiRotateGestures;
        if (typedArrayObtainAttributes.hasValue(i5)) {
            googleMapOptions.rotateGesturesEnabled(typedArrayObtainAttributes.getBoolean(i5, true));
        }
        int i6 = R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (typedArrayObtainAttributes.hasValue(i6)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(typedArrayObtainAttributes.getBoolean(i6, true));
        }
        int i7 = R.styleable.MapAttrs_uiScrollGestures;
        if (typedArrayObtainAttributes.hasValue(i7)) {
            googleMapOptions.scrollGesturesEnabled(typedArrayObtainAttributes.getBoolean(i7, true));
        }
        int i8 = R.styleable.MapAttrs_uiTiltGestures;
        if (typedArrayObtainAttributes.hasValue(i8)) {
            googleMapOptions.tiltGesturesEnabled(typedArrayObtainAttributes.getBoolean(i8, true));
        }
        int i9 = R.styleable.MapAttrs_uiZoomGestures;
        if (typedArrayObtainAttributes.hasValue(i9)) {
            googleMapOptions.zoomGesturesEnabled(typedArrayObtainAttributes.getBoolean(i9, true));
        }
        int i10 = R.styleable.MapAttrs_uiZoomControls;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            googleMapOptions.zoomControlsEnabled(typedArrayObtainAttributes.getBoolean(i10, true));
        }
        int i11 = R.styleable.MapAttrs_liteMode;
        if (typedArrayObtainAttributes.hasValue(i11)) {
            googleMapOptions.liteMode(typedArrayObtainAttributes.getBoolean(i11, false));
        }
        int i12 = R.styleable.MapAttrs_uiMapToolbar;
        if (typedArrayObtainAttributes.hasValue(i12)) {
            googleMapOptions.mapToolbarEnabled(typedArrayObtainAttributes.getBoolean(i12, true));
        }
        int i13 = R.styleable.MapAttrs_ambientEnabled;
        if (typedArrayObtainAttributes.hasValue(i13)) {
            googleMapOptions.ambientEnabled(typedArrayObtainAttributes.getBoolean(i13, false));
        }
        int i14 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (typedArrayObtainAttributes.hasValue(i14)) {
            googleMapOptions.minZoomPreference(typedArrayObtainAttributes.getFloat(i14, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(i14)) {
            googleMapOptions.maxZoomPreference(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        int i15 = R.styleable.MapAttrs_backgroundColor;
        if (typedArrayObtainAttributes.hasValue(i15)) {
            googleMapOptions.backgroundColor(Integer.valueOf(typedArrayObtainAttributes.getColor(i15, zza.intValue())));
        }
        int i16 = R.styleable.MapAttrs_mapId;
        if (typedArrayObtainAttributes.hasValue(i16) && (string = typedArrayObtainAttributes.getString(i16)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        int i17 = R.styleable.MapAttrs_mapColorScheme;
        if (typedArrayObtainAttributes.hasValue(i17)) {
            googleMapOptions.mapColorScheme(typedArrayObtainAttributes.getInt(i17, 0));
        }
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    @Nullable
    public static CameraPosition zza(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_cameraTargetLat;
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(i) ? typedArrayObtainAttributes.getFloat(i, BitmapDescriptorFactory.HUE_RED) : 0.0f, typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLng) ? typedArrayObtainAttributes.getFloat(r0, BitmapDescriptorFactory.HUE_RED) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i2 = R.styleable.MapAttrs_cameraZoom;
        if (typedArrayObtainAttributes.hasValue(i2)) {
            builder.zoom(typedArrayObtainAttributes.getFloat(i2, BitmapDescriptorFactory.HUE_RED));
        }
        int i3 = R.styleable.MapAttrs_cameraBearing;
        if (typedArrayObtainAttributes.hasValue(i3)) {
            builder.bearing(typedArrayObtainAttributes.getFloat(i3, BitmapDescriptorFactory.HUE_RED));
        }
        int i4 = R.styleable.MapAttrs_cameraTilt;
        if (typedArrayObtainAttributes.hasValue(i4)) {
            builder.tilt(typedArrayObtainAttributes.getFloat(i4, BitmapDescriptorFactory.HUE_RED));
        }
        typedArrayObtainAttributes.recycle();
        return builder.build();
    }

    @Nullable
    public static LatLngBounds zzb(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float fValueOf = typedArrayObtainAttributes.hasValue(i) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i, BitmapDescriptorFactory.HUE_RED)) : null;
        int i2 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(i2) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i2, BitmapDescriptorFactory.HUE_RED)) : null;
        int i3 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(i3) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i3, BitmapDescriptorFactory.HUE_RED)) : null;
        int i4 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(i4) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i4, BitmapDescriptorFactory.HUE_RED)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    @NonNull
    public GoogleMapOptions ambientEnabled(boolean z) {
        this.zzn = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions backgroundColor(@Nullable @ColorInt Integer num) {
        this.zzs = num;
        return this;
    }

    @NonNull
    public GoogleMapOptions camera(@Nullable CameraPosition cameraPosition) {
        this.zze = cameraPosition;
        return this;
    }

    @NonNull
    public GoogleMapOptions compassEnabled(boolean z) {
        this.zzg = Boolean.valueOf(z);
        return this;
    }

    @Nullable
    public Boolean getAmbientEnabled() {
        return this.zzn;
    }

    @Nullable
    @ColorInt
    public Integer getBackgroundColor() {
        return this.zzs;
    }

    @Nullable
    public CameraPosition getCamera() {
        return this.zze;
    }

    @Nullable
    public Boolean getCompassEnabled() {
        return this.zzg;
    }

    @Nullable
    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzq;
    }

    @Nullable
    public Boolean getLiteMode() {
        return this.zzl;
    }

    @MapColorScheme
    public int getMapColorScheme() {
        return this.zzu;
    }

    @Nullable
    public String getMapId() {
        return this.zzt;
    }

    @Nullable
    public Boolean getMapToolbarEnabled() {
        return this.zzm;
    }

    public int getMapType() {
        return this.zzd;
    }

    @Nullable
    public Float getMaxZoomPreference() {
        return this.zzp;
    }

    @Nullable
    public Float getMinZoomPreference() {
        return this.zzo;
    }

    @Nullable
    public Boolean getRotateGesturesEnabled() {
        return this.zzk;
    }

    @Nullable
    public Boolean getScrollGesturesEnabled() {
        return this.zzh;
    }

    @Nullable
    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzr;
    }

    @Nullable
    public Boolean getTiltGesturesEnabled() {
        return this.zzj;
    }

    @Nullable
    public Boolean getUseViewLifecycleInFragment() {
        return this.zzc;
    }

    @Nullable
    public Boolean getZOrderOnTop() {
        return this.zzb;
    }

    @Nullable
    public Boolean getZoomControlsEnabled() {
        return this.zzf;
    }

    @Nullable
    public Boolean getZoomGesturesEnabled() {
        return this.zzi;
    }

    @NonNull
    public GoogleMapOptions latLngBoundsForCameraTarget(@Nullable LatLngBounds latLngBounds) {
        this.zzq = latLngBounds;
        return this;
    }

    @NonNull
    public GoogleMapOptions liteMode(boolean z) {
        this.zzl = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions mapColorScheme(@MapColorScheme int i) {
        this.zzu = i;
        return this;
    }

    @NonNull
    public GoogleMapOptions mapId(@NonNull String str) {
        this.zzt = str;
        return this;
    }

    @NonNull
    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzm = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions mapType(int i) {
        this.zzd = i;
        return this;
    }

    @NonNull
    public GoogleMapOptions maxZoomPreference(float f) {
        this.zzp = Float.valueOf(f);
        return this;
    }

    @NonNull
    public GoogleMapOptions minZoomPreference(float f) {
        this.zzo = Float.valueOf(f);
        return this;
    }

    @NonNull
    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzk = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzh = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.zzr = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzj = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzd)).add("LiteMode", this.zzl).add("Camera", this.zze).add("CompassEnabled", this.zzg).add("ZoomControlsEnabled", this.zzf).add("ScrollGesturesEnabled", this.zzh).add("ZoomGesturesEnabled", this.zzi).add("TiltGesturesEnabled", this.zzj).add("RotateGesturesEnabled", this.zzk).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzr).add("MapToolbarEnabled", this.zzm).add("AmbientEnabled", this.zzn).add("MinZoomPreference", this.zzo).add("MaxZoomPreference", this.zzp).add("BackgroundColor", this.zzs).add("LatLngBoundsForCameraTarget", this.zzq).add("ZOrderOnTop", this.zzb).add("UseViewLifecycleInFragment", this.zzc).add("mapColorScheme", Integer.valueOf(this.zzu)).toString();
    }

    @NonNull
    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzc = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzc));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzn));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzr));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.writeInt(parcel, 23, getMapColorScheme());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zzf = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzi = Boolean.valueOf(z);
        return this;
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b, @SafeParcelable.Param(id = 3) byte b2, @SafeParcelable.Param(id = 4) int i, @Nullable @SafeParcelable.Param(id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b3, @SafeParcelable.Param(id = 7) byte b4, @SafeParcelable.Param(id = 8) byte b5, @SafeParcelable.Param(id = 9) byte b6, @SafeParcelable.Param(id = 10) byte b7, @SafeParcelable.Param(id = 11) byte b8, @SafeParcelable.Param(id = 12) byte b9, @SafeParcelable.Param(id = 14) byte b10, @SafeParcelable.Param(id = 15) byte b11, @Nullable @SafeParcelable.Param(id = 16) Float f, @Nullable @SafeParcelable.Param(id = 17) Float f2, @Nullable @SafeParcelable.Param(id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 19) byte b12, @Nullable @SafeParcelable.Param(id = 20) @ColorInt Integer num, @Nullable @SafeParcelable.Param(id = 21) String str, @SafeParcelable.Param(id = 23) @MapColorScheme int i2) {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b);
        this.zzc = com.google.android.gms.maps.internal.zza.zzb(b2);
        this.zzd = i;
        this.zze = cameraPosition;
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b3);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b4);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b6);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b7);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b8);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b9);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzn = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzo = f;
        this.zzp = f2;
        this.zzq = latLngBounds;
        this.zzr = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzs = num;
        this.zzt = str;
        this.zzu = i2;
    }
}
