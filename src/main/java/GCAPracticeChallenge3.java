/**
 * You're walking down a long straight road at night, illuminated by street lights,
 * and you're wondering how many of the lights are actually required to light up the whole street.
 *
 * Let's represent the street as a number line, going from 0 to n (inclusive).
 * Each streetlight has a different location (represented as an integer on the number line) and
 * light radius (an integer representing how far the light shines in either direction).
 *
 * Given n and lights, an array of 2-element arrays of the form {location, radius},
 * your task is to find the minimum number of these lights required to light up the whole street.
 * Return -1 if it's not possible to light the whole street with the given set of lights.
 *
 * Note: Each radius includes its own border; in other words, each light covers the inclusive interval
 * {location - radius, location + radius}.
 *
 * Example
 *
 * For n = 10 and lights = {{0, 5}, {1, 3}, {5, 4}, {8, 3}}, the output should be solution(n, lights) = 2.
 * lights{0} and lights{3} illuminate the whole street (segment {0, 10}).
 * There's no way to light the whole street with fewer than 2 lights, so the answer is 2.
 * For n = 9 and lights = {{5, 3}}, the output should be solution(n, lights) = -1.
 * It's not possible to light the whole street with this single light, because it lights only the segment {2, 8}
 * and does not light the segments {0, 2) or (8, 9}.
 *
 * For n = 8 and lights = {{2, 3}, {8, 2}}, the output should be solution(n, lights) = -1.
 *
 * The lights don't cover the space between points 5 and 6, and thus don't cover the whole segment {0, 10}.
 *
 * For n = 10 and lights = {{0, 5}, {1, 3}, {5, 4}}, the output should be solution(n, lights) = -1.
 * There are no lights to cover the rightmost segment of the street from 9 to 10.
 */
public class GCAPracticeChallenge3 {
    int illumination(int n, int[][] lights) {
        int result = 0;
        int numberLine = 0;
        for (int i = 0; i < lights.length; i++) {
            int afterRadius = lights[i][0] + lights[i][1];
            int beforeRadius = lights[i][0] - lights[i][1];
            //System.out.println("beforeRadius : " + beforeRadius);
            //System.out.println("afterRadius : " + afterRadius);
            if (beforeRadius < 0 ) {
                numberLine += afterRadius;
                if (numberLine >= n) {
                    result++;
                }

            } else if (beforeRadius > 0) {
                numberLine += beforeRadius;
                result++;
            }
        }
        //System.out.println("numberLine : " + numberLine);
        if (numberLine >= n)
        {
            return result;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        GCAPracticeChallenge3 g = new GCAPracticeChallenge3();
        int n = 15;
        int[][] lights = {{14,4},{12,5},{4,4},{14,5},{9,1}};
        System.out.println(g.illumination(n, lights));
    }

}


/** *******Test 1
 * Input:
 * n: 10
 * lights: {{0,5}, {1,3}, {5,4}, {8,3}}
 * Expected Output: 2
 *
 * *******Test2
 *Input:
 * n: 9
 * lights: {{5,3}}
 * Expected Output: -1
 *
 * *******Test3
 * Input:
 * n: 8
 * lights: {{2,3},{8,2}}
 * Expected Output: -1
 *
 * *******Test4
 * Input:
 * n: 10
 * lights: {{0,5}, {1,3}, {5,4}}
 * Expected Output: -1
 *
 * ********Test5
 *  Input:
 *  n: 1
 *  lights: {{0,100}}
 *  Expected Output: 1
 *
 * ********Test6
 *Input:
 * n: 15
 * lights: {{14,4},{12,5},{4,4},{14,5},{9,1}}
 * Expected Output: 2
 *
 * ********Test7
 * Input:
 * n: 15
 * lights: {{6,5},{1,2},{15,3},{3,2},{14,2},{6,4},{12,3},{1,3}}
 * Expected Output: 3
 *
 * ********Test8
 * Input:
 * n: 20
 * lights: {{0,1},{3,4},{5,4},{3,1},{0,4},{18,2},{4,1},{13,2},{2,4}}
 * Expected Output: -1
 *
 * ********Test9
 * Input:
 * n: 25
 * lights: {{15,3},{3,4},{14,3},{4,5},{22,4},{25,3},{8,1},{15,3},{11,5},{21,1}}
 * Expected Output: 4
 *
 * ********Test10
 *Input:
 * n: 50
 * lights: {{45,1},{33,4},{37,10},{27,8},{2,7},{5,5},{17,1},{38,1},{13,1},{33,4}}
 * Expected Output: -1
 *
 */