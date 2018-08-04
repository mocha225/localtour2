/** credit goes to Caine on 2/28/18 who published his app on github
 *
 */


package com.example.android.localtour;

public class Word {
    private String mAttraction;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**Create a new word object.
     * param attraction is the name of the attraction located in Springfield, MO
     * param description is the description to the attraction
     */
public Word(String attraction, String description, int imageResourceId) {
    mAttraction = attraction;
    mDescription = description;
    mImageResourceId = imageResourceId;
}

    /** get the name of the attraction.
     *
      */
    public String getAttraction() {
        return mAttraction;
    }

/** get the description of the attraction.
 *
 */
public String getDescription() {
    return mDescription;
}

public int getImageResourceId(){
    return mImageResourceId;
}

/** Returns whether or not there is an image for this name.
*
 */

public boolean hasImage() {
    return mImageResourceId !=NO_IMAGE_PROVIDED;
}
 }

