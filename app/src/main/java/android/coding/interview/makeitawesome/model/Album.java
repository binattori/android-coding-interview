package android.coding.interview.makeitawesome.model;

/**
 * Created by antonio on 24/07/15.
 */
public class Album {

    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;

    public Album() {
        this.albumId = -1;
        this.id = -1;
        this.title = "";
        this.url = "";
        this.thumbnailUrl = "";
    }

    public Album(int albumId, int id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}