package fredboat.audio.queue;

import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import java.util.List;

public interface ITrackProvider {
    
    public AudioTrack provideAudioTrack();
    
    public abstract AudioTrack getNext();
    
    public abstract List<AudioTrack> getAsList();
    
    public abstract boolean isEmpty();
    
    public abstract void add(AudioTrack track);
    
}
