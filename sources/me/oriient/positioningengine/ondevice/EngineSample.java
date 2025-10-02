package me.oriient.positioningengine.ondevice;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001f"}, d2 = {"Lme/oriient/positioningengine/ondevice/EngineSample;", "", "accel", "", "gyro", "quaternion", "rawMgnt", "magnet", "brmtr", "osLctn", "gyrouncalib", "gyroBias", "times", "eventFlags", "applicationState", "([D[D[D[D[D[D[D[D[D[D[D[D)V", "getAccel", "()[D", "getApplicationState", "getBrmtr", "getEventFlags", "getGyro", "getGyroBias", "getGyrouncalib", "getMagnet", "getOsLctn", "getQuaternion", "getRawMgnt", "getTimes", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EngineSample {

    @NotNull
    private final double[] accel;

    @NotNull
    private final double[] applicationState;

    @NotNull
    private final double[] brmtr;

    @NotNull
    private final double[] eventFlags;

    @NotNull
    private final double[] gyro;

    @NotNull
    private final double[] gyroBias;

    @NotNull
    private final double[] gyrouncalib;

    @NotNull
    private final double[] magnet;

    @NotNull
    private final double[] osLctn;

    @NotNull
    private final double[] quaternion;

    @NotNull
    private final double[] rawMgnt;

    @NotNull
    private final double[] times;

    public EngineSample(@NotNull double[] accel, @NotNull double[] gyro, @NotNull double[] quaternion, @NotNull double[] rawMgnt, @NotNull double[] magnet, @NotNull double[] brmtr, @NotNull double[] osLctn, @NotNull double[] gyrouncalib, @NotNull double[] gyroBias, @NotNull double[] times, @NotNull double[] eventFlags, @NotNull double[] applicationState) {
        Intrinsics.h(accel, "accel");
        Intrinsics.h(gyro, "gyro");
        Intrinsics.h(quaternion, "quaternion");
        Intrinsics.h(rawMgnt, "rawMgnt");
        Intrinsics.h(magnet, "magnet");
        Intrinsics.h(brmtr, "brmtr");
        Intrinsics.h(osLctn, "osLctn");
        Intrinsics.h(gyrouncalib, "gyrouncalib");
        Intrinsics.h(gyroBias, "gyroBias");
        Intrinsics.h(times, "times");
        Intrinsics.h(eventFlags, "eventFlags");
        Intrinsics.h(applicationState, "applicationState");
        this.accel = accel;
        this.gyro = gyro;
        this.quaternion = quaternion;
        this.rawMgnt = rawMgnt;
        this.magnet = magnet;
        this.brmtr = brmtr;
        this.osLctn = osLctn;
        this.gyrouncalib = gyrouncalib;
        this.gyroBias = gyroBias;
        this.times = times;
        this.eventFlags = eventFlags;
        this.applicationState = applicationState;
    }

    @NotNull
    public final double[] getAccel() {
        return this.accel;
    }

    @NotNull
    public final double[] getApplicationState() {
        return this.applicationState;
    }

    @NotNull
    public final double[] getBrmtr() {
        return this.brmtr;
    }

    @NotNull
    public final double[] getEventFlags() {
        return this.eventFlags;
    }

    @NotNull
    public final double[] getGyro() {
        return this.gyro;
    }

    @NotNull
    public final double[] getGyroBias() {
        return this.gyroBias;
    }

    @NotNull
    public final double[] getGyrouncalib() {
        return this.gyrouncalib;
    }

    @NotNull
    public final double[] getMagnet() {
        return this.magnet;
    }

    @NotNull
    public final double[] getOsLctn() {
        return this.osLctn;
    }

    @NotNull
    public final double[] getQuaternion() {
        return this.quaternion;
    }

    @NotNull
    public final double[] getRawMgnt() {
        return this.rawMgnt;
    }

    @NotNull
    public final double[] getTimes() {
        return this.times;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EngineSample(\n\taccel=");
        String string = Arrays.toString(this.accel);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append(", \n\tgyro=");
        String string2 = Arrays.toString(this.gyro);
        Intrinsics.g(string2, "toString(...)");
        sb.append(string2);
        sb.append(", \n\tquaternion=");
        String string3 = Arrays.toString(this.quaternion);
        Intrinsics.g(string3, "toString(...)");
        sb.append(string3);
        sb.append(", \n\trawMgnt=");
        String string4 = Arrays.toString(this.rawMgnt);
        Intrinsics.g(string4, "toString(...)");
        sb.append(string4);
        sb.append(", \n\tmagnet=");
        String string5 = Arrays.toString(this.magnet);
        Intrinsics.g(string5, "toString(...)");
        sb.append(string5);
        sb.append(", \n\tbrmtr=");
        String string6 = Arrays.toString(this.brmtr);
        Intrinsics.g(string6, "toString(...)");
        sb.append(string6);
        sb.append(", \n\tosLctn=");
        String string7 = Arrays.toString(this.osLctn);
        Intrinsics.g(string7, "toString(...)");
        sb.append(string7);
        sb.append(", \n\tgyrouncalib=");
        String string8 = Arrays.toString(this.gyrouncalib);
        Intrinsics.g(string8, "toString(...)");
        sb.append(string8);
        sb.append(", \n\tgyroBias=");
        String string9 = Arrays.toString(this.gyroBias);
        Intrinsics.g(string9, "toString(...)");
        sb.append(string9);
        sb.append(", \n\ttimes=");
        String string10 = Arrays.toString(this.times);
        Intrinsics.g(string10, "toString(...)");
        sb.append(string10);
        sb.append(", \n\teventFlags=");
        String string11 = Arrays.toString(this.eventFlags);
        Intrinsics.g(string11, "toString(...)");
        sb.append(string11);
        sb.append("\n, \n\tapplicationState=");
        String string12 = Arrays.toString(this.applicationState);
        Intrinsics.g(string12, "toString(...)");
        sb.append(string12);
        sb.append("\n)");
        return sb.toString();
    }
}
