package com.google.mlkit.vision.barcode.common;

import android.graphics.Point;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public class Barcode {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeSource f15990a;
    public final Point[] b;

    public static class Address {

        @Retention(RetentionPolicy.CLASS)
        public @interface AddressType {
        }
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface BarcodeFormat {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface BarcodeValueType {
    }

    public static class CalendarDateTime {
    }

    public static class CalendarEvent {
    }

    public static class ContactInfo {
    }

    public static class DriverLicense {
    }

    public static class Email {

        @Retention(RetentionPolicy.CLASS)
        public @interface FormatType {
        }
    }

    public static class GeoPoint {
    }

    public static class PersonName {
    }

    public static class Phone {

        @Retention(RetentionPolicy.CLASS)
        public @interface FormatType {
        }
    }

    public static class Sms {
    }

    public static class UrlBookmark {
    }

    public static class WiFi {

        @Retention(RetentionPolicy.CLASS)
        public @interface EncryptionType {
        }
    }

    public Barcode(BarcodeSource barcodeSource) {
        this.f15990a = (BarcodeSource) Preconditions.checkNotNull(barcodeSource);
        barcodeSource.getBoundingBox();
        this.b = barcodeSource.getCornerPoints();
    }

    public final int a() {
        int format = this.f15990a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }
}
