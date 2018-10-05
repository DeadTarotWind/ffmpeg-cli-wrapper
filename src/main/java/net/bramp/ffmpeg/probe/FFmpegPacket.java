package net.bramp.ffmpeg.probe;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings(
        value = {"UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD", "UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD"},
        justification = "POJO objects where the fields are populated by gson"
)
public class FFmpegPacket {
    public String codec_type;
    public int stream_index;
    public long pts;
    public double pts_time;
    public long dts;
    public double dts_time;
    public long duration;
    public double duration_time;
    public long size;
    public long pos;
    public String flags;
}
